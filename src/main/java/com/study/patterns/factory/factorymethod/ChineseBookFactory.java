package com.study.patterns.factory.factorymethod;

import com.study.patterns.factory.product.book.ChineseBook;
import com.study.patterns.factory.product.book.IBook;

/**
 * Created by ASUS on 2019/7/27.
 */
public class ChineseBookFactory implements IBookFactory {

    @Override
    public IBook create() {
        return new ChineseBook();
    }

}
