package com.study.patterns.strategy;

/**
 * Created by Huzi on 2019/8/9.
 */
public class TransportTest {
    public static void main(String[] args) {
        Transport taxi = TransportStrategy.get("Taxi");
        System.out.println(taxi.doTransport("用户1", 20));
    }
}
