package com.study.patterns.strategy;

/**
 * Created by Huzi on 2019/8/9.
 */
public class Taxi extends Transport {

    @Override
    protected String getName() {
        return "出租车";
    }

    @Override
    public double queryBalance() {
        return 20;
    }

}
