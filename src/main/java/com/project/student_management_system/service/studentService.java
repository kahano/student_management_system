package com.project.student_management_system.service;


import java.util.List;

import com.project.student_management_system.entity.student;

public interface studentService {

    List<student>getAllstudents();

    student saveStudent(student student);

    student getStudentById(Long id);

    student updateStudent(student student);

    void deleteStudentById(Long id);

    int getStudentIndex(Long id);
    
}
