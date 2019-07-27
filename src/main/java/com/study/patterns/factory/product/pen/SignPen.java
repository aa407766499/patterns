package com.study.patterns.factory.product.pen;

/**
 * Created by ASUS on 2019/7/27.
 */
public class SignPen implements IPen {

    @Override
    public void write() {
        System.out.println("用签字笔写字");
    }

}
