package com.sekai.Iservice.impl;

import com.sekai.Iservice.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("===目标方法doSome()====");

    }
}
