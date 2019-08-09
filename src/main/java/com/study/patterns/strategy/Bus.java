package com.study.patterns.strategy;

/**
 * Created by Huzi on 2019/8/9.
 */
public class Bus extends Transport {
    @Override
    protected String getName() {
        return "公交车";
    }

    @Override
    public double queryBalance() {
        return 10;
    }
}
