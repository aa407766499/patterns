package com.study.patterns.adapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public class PayService {

    public double queryBalance() {
        return 30;
    }

    public void pay(double amount) {
        System.out.println("使用银联支付");
        if (queryBalance() < amount) {
            System.out.println("余额不足");
            return;
        }
        System.out.println("支付成功");
    }

}
