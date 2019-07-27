package com.study.patterns.factory.abstractfactory;

import com.study.patterns.factory.product.book.IBook;
import com.study.patterns.factory.product.pen.IPen;

/**
 * Created by ASUS on 2019/7/27.
 */
public interface IFactory {

    IBook createBook();

    IPen createPen();

}
