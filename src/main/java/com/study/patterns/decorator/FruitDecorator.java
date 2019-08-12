package com.study.patterns.decorator;

/**
 * Created by Huzi on 2019/8/12.
 */
public class FruitDecorator extends CakeDecorator {

    public FruitDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "加一个水果";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }

}
