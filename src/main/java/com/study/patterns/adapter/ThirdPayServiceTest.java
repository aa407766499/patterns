package com.study.patterns.adapter;

/**
 * Created by ASUS on 2019/8/11.
 */
public class ThirdPayServiceTest {

    public static void main(String[] args) {
        ThirdPayServiceAdapter thirdPayServiceAdapter = new ThirdPayServiceAdapter();
        thirdPayServiceAdapter.payForWechat(10);
    }

}
