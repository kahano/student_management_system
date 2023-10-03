package com.project.student_management_system;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class StudentManagementSystemApplicationTests {
	
	@Autowired
	private MockMvc mocMvc;


	@Test
	void contextLoads() {

		assertNotNull(mocMvc);
	}

}
