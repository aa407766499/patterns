package com.study.patterns.decorator;

/**
 * Created by Huzi on 2019/8/12.
 */
public class ChocolateDecorator extends CakeDecorator {

    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "加一片巧克力";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

}
