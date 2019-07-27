package com.study.patterns.factory.factorymethod;

import com.study.patterns.factory.product.book.IBook;
import com.study.patterns.factory.product.book.MathBook;

/**
 * Created by ASUS on 2019/7/27.
 */
public class MathBookFactory implements IBookFactory {

    @Override
    public IBook create() {
        return new MathBook();
    }

}
