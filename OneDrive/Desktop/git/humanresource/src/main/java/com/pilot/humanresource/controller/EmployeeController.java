package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.Employee;
import com.pilot.humanresource.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController{

    public EmployeeService service = new EmployeeService();

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }


    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp){
        service.updateEmployee(id, temp);
    }

    @PostMapping("/new")
    public void updateEmployee(@RequestBody Employee temp){
        service.newEmployee(temp);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
         service.deleteEmployeeById(id);
    }


}

