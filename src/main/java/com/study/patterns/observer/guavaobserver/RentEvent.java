package com.study.patterns.observer.guavaobserver;

import com.google.common.eventbus.Subscribe;

/**
 * @author Huzi114
 * @ClassName: RentEvent
 * @Description:
 * @date 2019/8/12 9:58
 */
public class RentEvent {

    @Subscribe
    public void getRent(Integer msg) {
        System.out.println("交房租" + msg);
    }

}
