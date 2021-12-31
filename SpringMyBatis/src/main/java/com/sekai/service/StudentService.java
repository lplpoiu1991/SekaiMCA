package com.sekai.service;

import com.sekai.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);

    List<Student> querystudents();

}
