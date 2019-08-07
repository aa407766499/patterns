package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Huzi on 2019/8/6.
 */
public class MyProxy {

    private static final String ln = "\r\n";

    public Object newProxyInstance(MyClassLoader myClassLoader, Class<?>[] interfaces, MyInvocationHandler myInvocationHandler) throws Exception {
        //生成源码
        String src = generateSrc(interfaces);
        //写.java文件输出到磁盘
        String classPathFile = MyProxy.class.getResource("").getPath();
        File targetFile = new File(classPathFile+"$proxy0.java");
        FileWriter fileWriter = new FileWriter(targetFile);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();
        //编译成.class文件
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardFileManager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(targetFile);
        JavaCompiler.CompilationTask task = javaCompiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
        task.call();
        standardFileManager.close();
        targetFile.delete();
        //加载.class文件到JVM中
        Class<?> clazz = myClassLoader.findClass("$proxy0");
        //创建代理类实例
        Constructor<?> constructor = clazz.getConstructor(MyInvocationHandler.class);
        return constructor.newInstance(myInvocationHandler);
    }

    private String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;"+ln);
        sb.append("import java.lang.reflect.InvocationHandler;"+ln);
        sb.append("import com.study.patterns.proxy.dao.User;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("private MyInvocationHandler h;" + ln);
        sb.append("public $proxy0 (MyInvocationHandler h) {");
        sb.append("this.h = h;");
        sb.append("}");
        for (Class<?> clazz : interfaces) {
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                StringBuilder paramValues = new StringBuilder();
                StringBuilder paramTypes = new StringBuilder();
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i > 0) {
                        paramTypes.append(",");
                        paramValues.append(",");
                    }
                    paramTypes.append(parameterTypes[i].getName() + " " + toLowerFirstCase(parameterTypes[i].getSimpleName()));
                    paramValues.append(toLowerFirstCase(parameterTypes[i].getSimpleName()));
                }
                sb.append("@Override" + ln);
                sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(" + paramTypes.toString() + ") throws Throwable" + "{" + ln);
                sb.append("Method m = Class.forName(\"com.study.patterns.proxy.service.UserService\").getMethod(\"insertUser\","+"User.class"+")" + ";" + ln);
                sb.append("this.h.invoke(this,m,new Object[]{" + paramValues.toString() + "}" + ");" + ln);
                sb.append("return 1;" + ln);
                sb.append("}"+ln);
                sb.append("}");
            }
        }
        return sb.toString();
    }

    private String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        chars[0] = (char) (chars[0] + 32);
        return String.valueOf(chars);
    }

}
