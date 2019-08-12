package com.study.patterns.decorator;

/**
 * @author Huzi114
 * @ClassName: DecoratorTest
 * @Description:
 * @date 2019/8/12 9:45
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Cake cake = new BaseCake();
        cake = new FruitDecorator(cake);
        cake = new ChocolateDecorator(cake);
        System.out.println(cake.getMsg()+"=="+cake.getPrice());
    }

}
