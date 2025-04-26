package com.bootcampproject.example.BootCampProject.Repository;

import com.bootcampproject.example.BootCampProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
