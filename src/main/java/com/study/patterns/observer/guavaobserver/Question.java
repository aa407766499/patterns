package com.study.patterns.observer.guavaobserver;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Huzi114
 * @ClassName: Question
 * @Description:
 * @date 2019/8/12 14:04
 */
@Data
@AllArgsConstructor
public class Question {

    private String name;

    private String content;

}
