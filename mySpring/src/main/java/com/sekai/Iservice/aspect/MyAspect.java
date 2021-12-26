package com.sekai.Iservice.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
public class MyAspect {

    /*    @Before(value = "execution(public void com.sekai.Iservice.impl.*.*(String,Integer))")
        public void printdate(){
            Date mydate = new Date();
            System.out.println("当前时间"+mydate.toString());
        }*/
    @Before(value = "execution( * com.sekai.Iservice.impl.*.*(..))")
    public void printdate() {
        Date mydate = new Date();
        System.out.println("1当前时间" + mydate.toString());
    }

    @Before(value = "execution( * com.sekai.Iservice..*(..))")
    public void printdate2() {
        Date mydate = new Date();
        System.out.println("2当前时间" + mydate.toString());
    }
    @After(value = "execution( * *(..))")
    public void printdate3() {
        Date mydate = new Date();
        System.out.println("3当前时间" + mydate.toString());
    }
    @AfterThrowing(value = "execution( * *(..))")
    public void printdate4() {
        Date mydate = new Date();
        System.out.println("4当前时间" + mydate.toString());
    }


}
