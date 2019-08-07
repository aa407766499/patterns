package com.study.patterns.proxy.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Huzi on 2019/8/6.
 */
public class CglibTransactionAdvisor implements MethodInterceptor {

    public Object getInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //第一个参数：代理类实例
    //第二个参数：被代理类方法
    //第三个参数：方法入参
    //第四个参数：方法代理，用来实现FastClass机制直接调用方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("开启事务");
    }

    private void after() {
        System.out.println("提交事务");
    }

}
