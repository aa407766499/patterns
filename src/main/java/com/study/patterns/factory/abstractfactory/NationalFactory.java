package com.study.patterns.factory.abstractfactory;

import com.study.patterns.factory.product.book.ChineseBook;
import com.study.patterns.factory.product.book.IBook;
import com.study.patterns.factory.product.pen.BallPen;
import com.study.patterns.factory.product.pen.IPen;

/**
 * Created by ASUS on 2019/7/27.
 */
public class NationalFactory implements IFactory {

    @Override
    public IBook createBook() {
        return new ChineseBook();
    }

    @Override
    public IPen createPen() {
        return new BallPen();
    }

}
