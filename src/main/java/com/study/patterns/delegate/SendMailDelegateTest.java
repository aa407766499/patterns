package com.study.patterns.delegate;

/**
 * Created by Huzi on 2019/8/9.
 */
public class SendMailDelegateTest {
    public static void main(String[] args) {
        new Customer().sendMail(new CaiNiao(), "书", "SF");
    }
}
