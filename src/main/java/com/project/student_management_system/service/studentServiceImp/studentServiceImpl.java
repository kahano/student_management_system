package com.project.student_management_system.service.studentServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.student_management_system.entity.student;
import com.project.student_management_system.repository.studentRepository;
import com.project.student_management_system.service.studentService;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    private studentRepository studentRespository;

   


    @Override
    public List<student>getAllstudents(){
        return studentRespository.findAll();

    }
    
    @Override
    public student saveStudent(student student){
        return studentRespository.save(student);
    }


    @Override
    public student getStudentById(Long id) {
        // TODO Auto-generated method stub
        return studentRespository.findById(id).get();
    }


    @Override
    public student updateStudent(student student){
        // TODO Auto-generated method stub
        return studentRespository.save(student);

       
    }


    @Override
    public void deleteStudentById(Long id) {
        // TODO Auto-generated method stub
       studentRespository.deleteById(id);
    }
    
}

