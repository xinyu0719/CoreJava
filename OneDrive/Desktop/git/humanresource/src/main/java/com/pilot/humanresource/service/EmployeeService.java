package com.pilot.humanresource.service;

import com.pilot.humanresource.dao.EmployeeRepository;
import com.pilot.humanresource.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id){
        return repo.getEmployeeById(id);
    }
    public List<Employee> getAllEmployees(){
        return repo.getAllEmployees();
    }
    public void updateEmployee(int id, Employee temp){
         repo.updateEmployee(id,temp);
    }
    public void updateEmployee(Employee temp){
        repo.updateEmployee(temp);
    }
    public void newEmployee(Employee temp){
        repo.newEmployee(temp);
    }
    public void deleteEmployeeById(int id){
        repo.deleteEmployeeById(id);
    }
    public void deleteAllEmployees(){
        repo.deleteAllEmployees();
    }
}
