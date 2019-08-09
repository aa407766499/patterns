package com.study.patterns.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 菜鸟驿站
 * Created by Huzi on 2019/8/9.
 */
public class CaiNiao {

    private Map<String, ExpressCompany> expressCompanyMap = new HashMap<>();

    {
        expressCompanyMap.put("SF", new ShunFengCompany());
        expressCompanyMap.put("ST", new ShenTongCompany());
    }

    public void sendMail(String mail, String expressCompanyName) {
        expressCompanyMap.get(expressCompanyName).doSendFastMail(mail);
    }

}
