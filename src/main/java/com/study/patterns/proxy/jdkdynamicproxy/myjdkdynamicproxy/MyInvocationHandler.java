package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;

import java.lang.reflect.Method;

/**
 * Created by Huzi on 2019/8/6.
 */
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Exception;

}
