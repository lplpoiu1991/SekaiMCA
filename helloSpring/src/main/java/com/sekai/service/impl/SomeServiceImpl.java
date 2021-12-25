package com.sekai.service.impl;

import com.sekai.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("实现了dosome接口");
    }
}
