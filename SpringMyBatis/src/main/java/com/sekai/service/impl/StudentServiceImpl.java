package com.sekai.service.impl;

import com.sekai.dao.StudentDao;
import com.sekai.domain.Student;
import com.sekai.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertstudent(student);

        return nums;
    }

    @Override
    public List<Student> querystudents() {
        List<Student> students = studentDao.selectstudents();
        return students;
    }


}
