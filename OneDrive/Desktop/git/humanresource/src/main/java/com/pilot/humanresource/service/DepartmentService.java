package com.pilot.humanresource.service;

import com.pilot.humanresource.DAO.DepartmentRepository;
import com.pilot.humanresource.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department getDepartmentById(int id){
        return repo.findById(id).orElse(null);
    }

    public List<Department> getAllDepartment(){
        return repo.findAll();
    }
    public Department newDepartment(Department department){
        return repo.save(department);
    }
    public void deleteDepartment(int id){
        repo.deleteById(id);
    }
    public Department updateDepartment(Department department){
        Department temp = repo.findById(department.getDeptid()).orElse(null);
        temp.setName(department.getName());
        temp.setLoc(department.getLoc());
        return repo.save(temp);
    }
}
