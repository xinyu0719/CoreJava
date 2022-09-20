package com.pilot.humanresource.dao;

import com.pilot.humanresource.model.Department;
import com.pilot.humanresource.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DepartmentRepository {
    static List<Department> departments;

    static {
        departments = new ArrayList<>();
        departments.add(new Department(1, "Mark"));
        departments.add(new Department(2, "Lucy"));
    }

    public List<Department> getAllDepartments(){
        return departments;
    }

    public Department getDepartmentById(int id){
        return departments.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
    }

    public void updateDepartment(int id, Department temp){
        Department target = this.getDepartmentById(id);
        target.setName(temp.getName());
    }

    public void updateDepartment(Department temp){
        Department target = departments.stream().filter(e -> temp.getId() == e.getId()).findFirst().orElse(null);
        if(target != null){
            target.setName(temp.getName());
        }
    }

    public void newDepartment(Department temp){
        //temp should not exist already in employees -- sanity check
        int maxId = departments.stream().mapToInt(e -> e.getId()).max().getAsInt();
        temp.setId(maxId + 1);
        departments.add(temp);
    }

    public void deleteDepartmentById(int id){
        Iterator<Department> it = departments.iterator();
        while(it.hasNext()){
            Department temp = it.next();
            if(id == temp.getId()){
                it.remove();
            }
        }
    }

    public void deleteAllEmployees(){
        departments.clear();
    }
}
