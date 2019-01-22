package com.employees2.employees_lab_2.repositories;

import com.employees2.employees_lab_2.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
