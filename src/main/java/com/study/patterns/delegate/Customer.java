package com.study.patterns.delegate;

/**
 * 顾客
 * Created by Huzi on 2019/8/9.
 */
public class Customer {

    public void sendMail(CaiNiao caiNiao, String mail, String expressCompanyName) {
        new CaiNiao().sendMail(mail, expressCompanyName);
    }

}
