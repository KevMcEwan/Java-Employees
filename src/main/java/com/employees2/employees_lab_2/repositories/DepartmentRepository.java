package com.employees2.employees_lab_2.repositories;

import com.employees2.employees_lab_2.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
