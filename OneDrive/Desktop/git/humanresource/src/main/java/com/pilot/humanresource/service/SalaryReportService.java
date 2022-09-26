package com.pilot.humanresource.service;

import com.pilot.humanresource.DAO.SalaryReportRepository;
import com.pilot.humanresource.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaryReportService {
    @Autowired
    private SalaryReportRepository repo;

    public SalaryReport getSalaryReportByJob(String job){
        return repo.getSalaryReportByJob(job);
    }

    public SalaryReport newSalaryReport(SalaryReport report){
        return repo.save(report);
    }

    public void DeleteSalaryReportByJob(String job){
         repo.deleteByJob(job);
    }

    public SalaryReport UpdateSalaryReport(SalaryReport report){
        SalaryReport temp = repo.getSalaryReportByJob(report.getJob());
        temp.setDepartment(report.getDepartment());
        temp.setJob(report.getJob());
        temp.setSalmin(report.getSalmin());
        temp.setSalmax(report.getSalmax());
        temp.setSalavg(report.getSalavg());
        temp.setSaltotal(report.getSaltotal());
        temp.setEmpcount(report.getEmpcount());
        return repo.save(temp);
    }
}
