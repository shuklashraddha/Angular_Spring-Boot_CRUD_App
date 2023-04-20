package com.app.employeems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.employeems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
