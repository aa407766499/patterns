package com.study.patterns.decorator;

/**
 * Created by Huzi on 2019/8/12.
 */
public class BaseCake implements Cake{

    @Override
    public String getMsg() {
        return "蛋糕";
    }

    @Override
    public int getPrice() {
        return 15;
    }

}
