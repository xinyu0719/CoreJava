package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.Department;
import com.pilot.humanresource.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return service.getDepartmentById(id);
    }
    @PostMapping("/add")
    public Department addNewDepartment(@RequestBody Department department){
        return service.newDepartment(department);
    }
    @PutMapping("update")
    public Department updateDepartment(@RequestBody Department department){
        return service.updateDepartment(department);
    }
    @DeleteMapping("delete/{id}")
    public void deleteDepartment(@PathVariable int id){
        service.deleteDepartment(id);
    }

}
