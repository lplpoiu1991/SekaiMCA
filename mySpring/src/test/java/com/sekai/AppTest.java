package com.sekai;

import static org.junit.Assert.assertTrue;

import com.sekai.Iservice.SomeService;
import com.sekai.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = (Student) ac.getBean("oneStudent");
        System.out.println(stu);

    }

    @Test
    public void Test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        SomeService proxy = (SomeService) ac.getBean("myService");
        System.out.println(proxy.getClass().getName());
        proxy.doSome("sekai", 30);

    }

    @Test
    public void Test03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        SomeService proxy = (SomeService) ac.getBean("myService");
        //String str = proxy.doOther("sekai", 30);
        com.sekai.Iservice.Student str = proxy.doOther2();
        System.out.println("原方法结果" + str);


    }
}
