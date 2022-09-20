package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.Department;
import com.pilot.humanresource.model.Employee;
import com.pilot.humanresource.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/department")
public class DepartmentController {
    public DepartmentService service = new DepartmentService();

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Department> getDepartment(){
        return service.getAllDepartments();
    }


    @GetMapping("/get/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return service.getDepartmentById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department temp){
        service.updateDepartment(id, temp);
    }

    @PostMapping("/new")
    public void updateDepartment(@RequestBody Department temp){
        service.newDepartment(temp);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        service.deleteDepartmentById(id);
    }
}
