package com.lee.concert;

import org.springframework.stereotype.Component;

@Component
public class CNConcert implements Performance {
    @Override
    public void perform() {
        System.out.println("hello");
    }
}
