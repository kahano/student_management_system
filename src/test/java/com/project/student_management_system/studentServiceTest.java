package com.project.student_management_system;


import static org.junit.Assert.assertEquals;
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
    public void get_listOfStudents(){
        
      when(student_repository.findAll()).thenReturn(Arrays.asList
        (new student("John", "Bjørnson", "john_bj@gmail.com"),
        new student("Andreas", "Karlsen", "And_karl@gmail.com")));
      

        List<student> result = student_service.getAllstudents();

        assertEquals("John",result.get(0).getFirstname());
        assertEquals("Bjørnson",result.get(0).getLastname());
        assertEquals("john_bj@gmail.com",result.get(0).getEmail());
        
        assertEquals("Andreas",result.get(1).getFirstname());
        assertEquals("Karlsen",result.get(1).getLastname());
         assertEquals("And_karl@gmail.com",result.get(1).getEmail());
       
    }
     
   

   


    
    
}
