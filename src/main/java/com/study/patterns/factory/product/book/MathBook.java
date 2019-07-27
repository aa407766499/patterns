package com.study.patterns.factory.product.book;

/**
 * Created by ASUS on 2019/7/27.
 */
public class MathBook implements IBook {

    @Override
    public void read() {
        System.out.println("读数学书");
    }

}
