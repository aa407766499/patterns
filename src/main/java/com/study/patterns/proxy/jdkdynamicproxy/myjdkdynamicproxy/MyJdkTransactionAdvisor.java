package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;

import java.lang.reflect.Method;

/**
 * Created by Huzi on 2019/8/6.
 */
public class MyJdkTransactionAdvisor implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return new MyProxy().newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        before();
        Object result = method.invoke(target, args);
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
