package com.study.patterns.strategy;

/**
 * Created by Huzi on 2019/8/9.
 */
public class Subway extends Transport {

    @Override
    protected String getName() {
        return "地铁";
    }

    @Override
    public double queryBalance() {
        return 10;
    }

}
