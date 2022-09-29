package com.pilot.humanresource.service;

import com.pilot.humanresource.DAO.SalaryReportRepository;
import com.pilot.humanresource.model.ReportId;
import com.pilot.humanresource.model.SalaryReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryReportService {
    @Autowired
    private SalaryReportRepository repo;

    public SalaryReport getSalaryReportById(ReportId id){
        return repo.findById(id).orElse(null);
    }

    public List<SalaryReport> getSalaryReport(){
        return repo.findAll();
    }

    public SalaryReport NewSalaryReport(SalaryReport report){
        return repo.save(report);
    }
    public void deleteSalaryReport(ReportId id){
        repo.deleteById(id);
    }
    public SalaryReport UpdateSalaryReport(SalaryReport report){
        SalaryReport temp = repo.findById(report.getId()).orElse(null);
        temp.setSalmin(report.getSalmin());
        temp.setSalmax(report.getSalmax());
        temp.setSalavg(report.getSalavg());
        temp.setSaltotal(report.getSaltotal());
        temp.setEmpcount(report.getEmpcount());
        temp.setUpdatetime(report.getUpdatetime());
        return repo.save(temp);
    }
}
