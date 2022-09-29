package com.pilot.humanresource.controller;

import com.pilot.humanresource.model.ReportId;
import com.pilot.humanresource.model.SalaryReport;
import com.pilot.humanresource.service.SalaryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Report")
public class SalaryReportController {
    @Autowired
    private SalaryReportService service;

    @GetMapping("/all")
    public List<SalaryReport> getSalaryReport(){
        return service.getSalaryReport();
    }

    @GetMapping("/search/{job}_{department}")
    public SalaryReport getSalaryReportById(@PathVariable String job, @PathVariable String department){
        return service.getSalaryReportById(new ReportId(job,department));
    }

    @PostMapping("/add")
    public SalaryReport AddNewReport(@RequestBody SalaryReport report){
        return service.NewSalaryReport(report);
    }

    @PutMapping("/update")
    public SalaryReport UpdateReport(@RequestBody SalaryReport report){
        return service.UpdateSalaryReport(report);
    }

    @DeleteMapping("/delete/{job}_{department}")
    public void DeleteReportById(@PathVariable String job, @PathVariable String department){
        service.deleteSalaryReport(new ReportId(job,department));
    }
}
