package com.sekai;

import static org.junit.Assert.assertTrue;

import com.sekai.service.SomeService;
import com.sekai.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    @Test
    public void  test02(){
        String config = "beans.xml";
        ApplicationContext ac=  new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");
        service.doSome();

    }


}
