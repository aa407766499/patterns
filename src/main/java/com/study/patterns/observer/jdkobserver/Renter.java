package com.study.patterns.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Huzi114
 * @ClassName: Renter
 * @Description:
 * @date 2019/8/12 13:43
 */
public class Renter implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Landlord landlord = (Landlord) o;
        Integer money = (Integer) arg;
        System.out.println("交房租：" + money);
    }

}
