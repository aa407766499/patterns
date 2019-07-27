package com.study.patterns.factory.factorymethod;

import com.study.patterns.factory.product.book.IBook;

/**
 * Created by ASUS on 2019/7/27.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IBookFactory iBookFactory = new ChineseBookFactory();
        IBook chineseBook = iBookFactory.create();
        chineseBook.read();
        iBookFactory = new MathBookFactory();
        IBook mathBook = iBookFactory.create();
        mathBook.read();
    }

}
