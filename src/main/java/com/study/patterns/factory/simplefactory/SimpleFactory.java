package com.study.patterns.factory.simplefactory;

/**
 * Created by ASUS on 2019/7/27.
 */
public class SimpleFactory {

    public IBook create(String bookName) {
        switch (bookName) {
            case "语文":
                return new ChineseBook();
            case "数学":
                return new MathBook();
            default :
                return null;
        }
    }

}
