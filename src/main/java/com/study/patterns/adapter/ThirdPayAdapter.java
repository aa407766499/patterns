package com.study.patterns.adapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public interface ThirdPayAdapter {

    void payForWechat(double amount);

    void payForAlipay(double amount);

}
