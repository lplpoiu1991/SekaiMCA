package com.sekai.dao;

import com.sekai.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertstudent(Student student);

    List<Student> selectstudents();

}
