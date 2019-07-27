package com.study.patterns.factory.simplefactory;

/**
 * Created by ASUS on 2019/7/27.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        IBook chineseBook = simpleFactory.create("语文");
        chineseBook.read();
        IBook mathBook = simpleFactory.create("数学");
        mathBook.read();
    }

}
