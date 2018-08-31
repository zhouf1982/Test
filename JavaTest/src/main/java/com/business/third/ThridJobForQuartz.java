package com.business.third;

import org.quartz.DisallowConcurrentExecution;


@DisallowConcurrentExecution
public class ThridJobForQuartz {
    public void ThridJobA() {
        System.out.println(System.currentTimeMillis());
    }

    public void ThridJobB() {
        System.out.println(System.currentTimeMillis());
    }
}
