package com.study.patterns.factory.product.pen;

/**
 * Created by ASUS on 2019/7/27.
 */
public class BallPen implements IPen {

    @Override
    public void write() {
        System.out.println("用圆珠笔写字");
    }

}
