package com.sekai;

import static org.junit.Assert.assertTrue;

import com.sekai.dao.Student;
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
        Student std = (Student) ac.getBean("Student1");
        System.out.println(std);

        service.doSome();

    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        String names[] = ac.getBeanDefinitionNames();
        for (String name:ac.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }


}
