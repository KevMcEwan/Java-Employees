package com.employees2.employees_lab_2;

import com.employees2.employees_lab_2.models.Employee;
import com.employees2.employees_lab_2.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesLab2ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee catriona = new Employee("Catriona", 30, 123, "cat@otters.com");
		employeeRepository.save(catriona);
	}

}

