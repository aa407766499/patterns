package com.study.patterns.delegate;

/**
 * Created by Huzi on 2019/8/9.
 */
public class ShenTongCompany implements ExpressCompany {
    @Override
    public void doSendFastMail(String mail) {
        System.out.println("申通送快递：" + mail);
    }
}
