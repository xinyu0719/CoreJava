package com.pilot.humanresource.DAO;

import com.pilot.humanresource.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
