package com.study.patterns.decorator;

/**
 * Created by Huzi on 2019/8/12.
 */
public abstract class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getMsg() {
        return this.cake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.cake.getPrice();
    }

}
