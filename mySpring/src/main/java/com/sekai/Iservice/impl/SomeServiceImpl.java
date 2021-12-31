package com.sekai.Iservice.impl;

import com.sekai.Iservice.SomeService;
import com.sekai.Iservice.Student;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("===目标方法doSome()====");

    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("=======目标方法doOther===============");
        return "abcd";
    }

    @Override
    public Student doOther2() {
        Student student = new Student();
        student.age =20;
        student.name="lisi";
        return student;
    }
}
