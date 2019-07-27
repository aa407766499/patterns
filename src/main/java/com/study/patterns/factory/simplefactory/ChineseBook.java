package com.study.patterns.factory.simplefactory;

/**
 * Created by ASUS on 2019/7/27.
 */
public class ChineseBook implements IBook {

    @Override
    public void read() {
        System.out.println("读语文书");
    }

}
