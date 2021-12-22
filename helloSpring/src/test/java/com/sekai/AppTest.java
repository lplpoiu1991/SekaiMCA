package com.sekai;

import static org.junit.Assert.assertTrue;

import com.sekai.service.SomeService;
import com.sekai.service.impl.SomeServiceImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
}
