package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;

import java.io.*;

/**
 * Created by Huzi on 2019/8/6.
 */
public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        String classPath = MyClassLoader.class.getResource("").getPath();
        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        //类路径下查找.class文件，通过字节输出流转换成字节数组
        File file = new File(classPath + name.replaceAll("\\.","/") + ".class");
        Class<?> clazz = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes, 0, len);
            }
            //第一个参数为被加载类的全限定类名
            clazz = defineClass(className, byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clazz;
    }

}
