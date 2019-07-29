package com.study.patterns.singleton;

/**
 * 注册式单例（枚举式）
 *
 * JDK底层防止序列化攻击与反射攻击
 *
 * Created by ASUS on 2019/7/29.
 */
public enum EnumSingleton {

    INSTANCE;

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
