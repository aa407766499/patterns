package com.study.patterns.delegate;

/**
 * Created by Huzi on 2019/8/9.
 */
public class ShunFengCompany implements ExpressCompany {
    @Override
    public void doSendFastMail(String mail) {
        System.out.println("顺丰送快递：" + mail);
    }
}
