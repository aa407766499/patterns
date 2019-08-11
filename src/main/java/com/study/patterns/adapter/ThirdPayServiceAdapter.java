package com.study.patterns.adapter;

import com.study.patterns.adapter.thirdpayadapter.AlipayAdapter;
import com.study.patterns.adapter.thirdpayadapter.PayAdapter;
import com.study.patterns.adapter.thirdpayadapter.WechatPayAdapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public class ThirdPayServiceAdapter extends PayService implements ThirdPayAdapter {

    @Override
    public void payForWechat(double amount) {
        processPay(amount, WechatPayAdapter.class);
    }

    @Override
    public void payForAlipay(double amount) {
        processPay(amount, AlipayAdapter.class);
    }

    private void processPay(double amount, Class<? extends PayAdapter> clazz) {
        try {
            PayAdapter pay = clazz.newInstance();
            if (pay.supports(pay)) {
                pay.pay(amount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
