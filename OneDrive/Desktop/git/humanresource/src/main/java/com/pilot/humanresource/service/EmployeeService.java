package com.pilot.humanresource.service;

import com.pilot.humanresource.DAO.EmployeeRepository;
import com.pilot.humanresource.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

   public Employee getEmployeeById(int id){
       return repo.findById(id).orElse(null);
   }

   public Employee newEmployee(Employee employee){
       return repo.save(employee);
   }
   public void deleteEmployee(int id){
       repo.deleteById(id);
   }
   public Employee updateEmploy(Employee employee){
       Employee temp = repo.findById(employee.getEmpid()).orElse(null);
       temp.setName(employee.getName());
       temp.setJob(employee.getJob());
       temp.setManager(employee.getManager());
       temp.setDeptid(temp.getDeptid());
       temp.setHiredate(temp.getHiredate());
       temp.setSalary(temp.getSalary());
       return repo.save(temp);
   }

}
