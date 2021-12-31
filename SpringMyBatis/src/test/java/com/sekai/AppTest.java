package com.sekai;

import static org.junit.Assert.assertTrue;

import com.sekai.dao.StudentDao;
import com.sekai.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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

        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
/*        String names[] = ac.getBeanDefinitionNames();
        for (String na:
             names) {
            System.out.println("对象" + na + "|" + ac.getBean(na));

        }*/
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        List<Student> students = studentDao.selectstudents();
        for (Student stu :
                students) {
            System.out.println(stu);
        }
    }
}
