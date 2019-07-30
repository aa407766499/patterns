package com.study.patterns.singleton.test;

import com.study.patterns.singleton.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 单例反射测试
 *
 * Created by Huzi on 2019/7/30.
 */
public class SingletonReflectiveTest {

    public static void main(String[] args) throws Exception {
        Class<?> cl = LazyInnerClassSingleton.class;
        Constructor<?> noParametersConstructor = cl.getDeclaredConstructor(null);
        noParametersConstructor.setAccessible(true);
        LazyInnerClassSingleton lazyInnerClassSingleton = (LazyInnerClassSingleton) noParametersConstructor.newInstance(null);
    }

}
