package com.sekai.Iservice.aspect;

import com.sekai.Iservice.Student;
import com.sekai.Iservice.impl.SomeServiceImpl;
import org.aspectj.lang.JoinPoint;
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
    public void printDate2(JoinPoint jp) {

        System.out.println("方法签名" + jp.getSignature());
        System.out.println("方法名称" + jp.getSignature().getName());
        Date mydate = new Date();
        System.out.println("2当前时间" + mydate.toString());
    }

    @After(value = "execution( * *(..))")
    public void printDate3() {
        Date mydate = new Date();
        System.out.println("3当前时间" + mydate.toString());
    }
    @AfterReturning(value = "execution( * *(..))", returning = "res")
    public void printDate4(Object res) {

        System.out.println("4AfterReturning->后置通知");
        System.out.println("获取的返回值" + res);
        Student res1 = (Student) res;
        res1.name = "sekai";

        System.out.println("更改切面res：efg");
    }


}
