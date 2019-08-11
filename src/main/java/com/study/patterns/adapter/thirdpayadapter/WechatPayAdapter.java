package com.study.patterns.adapter.thirdpayadapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public class WechatPayAdapter implements PayAdapter {

    @Override
    public boolean supports(Object pay) {
        return pay instanceof WechatPayAdapter;
    }

    @Override
    public double queryBalance() {
        return 50;
    }

    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付");
        if (queryBalance() < amount) {
            System.out.println("余额不足");
            return;
        }
        System.out.println("支付成功");
    }

}
