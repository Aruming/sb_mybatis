package com.ll.exam.sb_mybatis.app.base.rq;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
public class Rq {
    @Getter
    private int count;

    public void increaseCount() {
        count++;
    }
}