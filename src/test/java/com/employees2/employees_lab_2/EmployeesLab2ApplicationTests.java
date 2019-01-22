package com.employees2.employees_lab_2;

import com.employees2.employees_lab_2.models.Department;
import com.employees2.employees_lab_2.models.Employee;
import com.employees2.employees_lab_2.models.Project;
import com.employees2.employees_lab_2.repositories.DepartmentRepository;
import com.employees2.employees_lab_2.repositories.EmployeeRepository;
import com.employees2.employees_lab_2.repositories.ProjectRepository;
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

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Pirate creators");
		departmentRepository.save(department);
		Employee catriona = new Employee("Catriona", 30, 123, "cat@otters.com", department);
		employeeRepository.save(catriona);
	}

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("Pirate creators");
		departmentRepository.save(department);
		Employee catriona = new Employee("Catriona", 30, 123, "cat@otters.com", department);
		employeeRepository.save(catriona);
		Project project =  new Project("Test project", 10);
		project.addEmployee(catriona);
		projectRepository.save(project);
	}

}

