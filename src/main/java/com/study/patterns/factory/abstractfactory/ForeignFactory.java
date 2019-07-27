package com.study.patterns.factory.abstractfactory;

import com.study.patterns.factory.product.book.IBook;
import com.study.patterns.factory.product.book.MathBook;
import com.study.patterns.factory.product.pen.IPen;
import com.study.patterns.factory.product.pen.SignPen;

/**
 * Created by ASUS on 2019/7/27.
 */
public class ForeignFactory implements IFactory {

    @Override
    public IBook createBook() {
        return new MathBook();
    }

    @Override
    public IPen createPen() {
        return new SignPen();
    }

}
