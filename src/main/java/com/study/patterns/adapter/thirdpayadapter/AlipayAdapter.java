package com.study.patterns.adapter.thirdpayadapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public class AlipayAdapter implements PayAdapter {

    @Override
    public boolean supports(Object pay) {
        return pay instanceof AlipayAdapter;
    }

    @Override
    public double queryBalance() {
        return 100;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付");
        if (queryBalance() < amount) {
            System.out.println("余额不足");
            return;
        }
        System.out.println("支付成功");
    }

}
