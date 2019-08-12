package com.study.patterns.observer.guavaobserver;

import com.google.common.eventbus.EventBus;

/**
 * @author Huzi114
 * @ClassName: GetRentTest
 * @Description:
 * @date 2019/8/12 12:24
 */
public class GetRentTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new RentEvent());
        eventBus.post(2000);
    }

}
