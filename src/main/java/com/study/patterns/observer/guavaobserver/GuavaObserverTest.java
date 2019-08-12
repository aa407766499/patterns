package com.study.patterns.observer.guavaobserver;

import com.google.common.eventbus.EventBus;

/**
 * @author Huzi114
 * @ClassName: GuavaObserverTest
 * @Description:
 * @date 2019/8/12 12:24
 */
public class GuavaObserverTest {

    public static void main(String[] args) {
        Gper gper = new Gper();
        gper.setId(209170);
        gper.setName("Huzi");
        gper.setQuestion(new Question("观察者模式","如何用GuavaAPI实现观察者模式"));
        EventBus eventBus = new EventBus();
        eventBus.register(new Teacher("tom"));
        eventBus.post(gper);
    }

}
