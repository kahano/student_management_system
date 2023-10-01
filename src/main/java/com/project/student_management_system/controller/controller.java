package com.project.student_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.student_management_system.entity.student;
import com.project.student_management_system.service.studentService;

@Controller
public class controller {

    @Autowired
    private studentService studentService ;

   

    //handler methods 
    @GetMapping("/students")
    public String studentList(Model model){
        model.addAttribute("students", studentService.getAllstudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createforum(Model model){

        student student = new student();
        model.addAttribute("student", student);
        return "create_student_forum";

    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") student student){
        studentService.saveStudent(student);
        return "redirect:/students";
        

    }

    @GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
        // fetching the student from the database by id
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

    @PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") student student,
			Model model) {
		
		// get student from database by id
		student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
     @GetMapping("/students/{id}") // handling delete request
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

    
}

