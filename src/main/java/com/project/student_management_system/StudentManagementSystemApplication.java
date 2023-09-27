package com.project.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.student_management_system.entity.student;
import com.project.student_management_system.repository.studentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	// injecting student repository object
	private studentRepository student_Repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		 student student1 = new student("John", "Bjørnson", "john_bj@gmail.com");
		 student_Repository.save(student1);
		
		 student student2 = new student("Andreas", "Karlsen", "And_karl@gmail.com");
		 student_Repository.save(student2);
		 
		 student student3 = new student("tony", "svensen", "tony_sven@gmail.com");
		 student_Repository.save(student3);
		
	}

	

}
