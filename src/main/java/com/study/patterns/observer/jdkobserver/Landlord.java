package com.study.patterns.observer.jdkobserver;

import java.util.Observable;

/**
 * @author Huzi114
 * @ClassName: Landlord
 * @Description:
 * @date 2019/8/12 13:45
 */
public class Landlord extends Observable {

    public void getRent(Integer money) {
        this.setChanged();
        this.notifyObservers(money);
    }

}
