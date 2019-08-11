package com.study.patterns.adapter.thirdpayadapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public interface PayAdapter {

    //区别于策略模式，需要判断兼容
    boolean supports(Object pay);

    double queryBalance();

    void pay(double amount);

}
