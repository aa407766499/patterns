package com.study.patterns.factory.abstractfactory;

import com.study.patterns.factory.product.book.IBook;
import com.study.patterns.factory.product.pen.IPen;

/**
 * Created by ASUS on 2019/7/27.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IFactory iFactory = new NationalFactory();
        IBook book = iFactory.createBook();
        IPen pen = iFactory.createPen();
        book.read();
        pen.write();

        iFactory = new ForeignFactory();
        IBook iBook = iFactory.createBook();
        IPen iPen = iFactory.createPen();
        iBook.read();
        iPen.write();
    }

}
