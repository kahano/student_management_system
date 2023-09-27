package com.project.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.student_management_system.entity.student;


public interface studentRepository extends JpaRepository<student,Long> {
    
}

