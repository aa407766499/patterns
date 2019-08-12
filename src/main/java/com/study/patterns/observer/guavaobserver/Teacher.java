package com.study.patterns.observer.guavaobserver;

import com.google.common.eventbus.Subscribe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Huzi114
 * @ClassName: Teacher
 * @Description:
 * @date 2019/8/12 14:02
 */
@AllArgsConstructor
@Getter
@Setter
public class Teacher {

    private String name;

    @Subscribe
    public void getQuestion(Gper gper) {
        System.out.println("收到学号：" + gper.getId() + "名称：" + gper.getName() + "的问题");
        System.out.println(this.getName() + "回答" + gper.getQuestion().getName() + "问题" + "," + "问题的内容为" + gper.getQuestion().getContent());
    }

}
