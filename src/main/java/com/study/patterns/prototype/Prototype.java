package com.study.patterns.prototype;

/**
 * Created by Huzi on 2019/7/30.
 */
public interface Prototype {

    Object deepClone() throws CloneNotSupportedException;

}
