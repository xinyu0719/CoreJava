package com.pilot.humanresource.DAO;

import com.pilot.humanresource.model.SalaryReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalaryReportRepository extends JpaRepository<SalaryReport, String> {
    SalaryReport getSalaryReportByJob(String job);
    void deleteByJob(String job);
}
