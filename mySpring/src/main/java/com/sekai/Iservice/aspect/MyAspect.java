package com.sekai.Iservice.aspect;

import org.aspectj.lang.annotation.*;

import java.util.Date;

@Aspect
public class MyAspect {

    @Before(value = "execution( * com.sekai.Iservice.impl.*.*(..))")
    public void printDate() {
        Date mydate = new Date();
        System.out.println("1当前时间" + mydate.toString());
    }

    @Before(value = "execution( * com.sekai.Iservice..*(..))")
    public void printDate2() {
        Date mydate = new Date();
        System.out.println("2当前时间" + mydate.toString());
    }
    @After(value = "execution( * *(..))")
    public void printDate3() {
        Date mydate = new Date();
        System.out.println("3当前时间" + mydate.toString());
    }
    @AfterThrowing(value = "execution( * *(..))")
    public void printDate4() {
        Date mydate = new Date();
        System.out.println("4当前时间" + mydate.toString());
    }


}
