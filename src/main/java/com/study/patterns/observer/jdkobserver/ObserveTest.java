package com.study.patterns.observer.jdkobserver;

/**
 * @author Huzi114
 * @ClassName: ObserveTest
 * @Description:
 * @date 2019/8/12 13:49
 */
public class ObserveTest {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        landlord.addObserver(new Renter());
        landlord.getRent(2000);
    }

}
