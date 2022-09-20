package com.pilot.humanresource.service;

import com.pilot.humanresource.dao.DepartmentRepository;
import com.pilot.humanresource.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository repo;

    public List<Department> getAllDepartments(){
        return repo.getAllDepartments();
    }
    public Department getDepartmentById(int id){
        return repo.getDepartmentById(id);
    }
    public void updateDepartment(int id, Department temp){
        repo.updateDepartment(id,temp);
    }
    public void updateDepartment(Department temp){
        repo.updateDepartment(temp);
    }
    public void newDepartment(Department temp){
        repo.newDepartment(temp);
    }
    public void deleteDepartmentById(int id){
        repo.deleteDepartmentById(id);
    }
    public void deleteAllEmployees(){
        repo.deleteAllEmployees();
    }
}
