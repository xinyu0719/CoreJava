package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.SalaryReport;
import com.pilot.humanresource.service.SalaryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Report")
public class SalaryReportController {
    @Autowired
    private SalaryReportService service;

    @GetMapping("/get/{job}")
    public  SalaryReport getSalaryReportByJob(@PathVariable String job){
        return service.getSalaryReportByJob(job);
    }

    @PostMapping("/add")
    public SalaryReport addnewSalaryReport(@RequestBody SalaryReport report){
        return service.newSalaryReport(report);
    }
    @PutMapping("/update")
    public SalaryReport updateSalaryReport(@RequestBody SalaryReport report){
        return service.UpdateSalaryReport(report);
    }
    @DeleteMapping("/delete/{job}")
    public void deletesalaryReport(@PathVariable String job){
        service.DeleteSalaryReportByJob(job);
    }

}
