package com.project.student_management_system;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.project.student_management_system.entity.student;
import com.project.student_management_system.repository.studentRepository;
import com.project.student_management_system.service.studentServiceImp.studentServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class studentServiceTest{

    @Mock
    private studentRepository student_repository;

    @InjectMocks
    private studentServiceImpl student_service;

    
     
    @Test
    public void get_studentByIndexTest(){
        
      when(student_repository.findAll()).thenReturn(Arrays.asList
        (new student("John", "Bjørnson", "john_bj@gmail.com"),
         new student("Ahmed", "Jonson", "ahm_bj@gmail.com")));
      

        List<student> result = student_service.getAllstudents();

        int actual_student = student_service.getStudentIndex(result.get(0).getId());
        int not_found = student_service.getStudentIndex((long) 124653);
        assertEquals(0,actual_student);
        assertEquals(-1000,not_found);

       
       
    }
     
   

   


    
    
}
