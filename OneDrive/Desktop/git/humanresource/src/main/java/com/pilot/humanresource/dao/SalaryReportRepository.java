package com.pilot.humanresource.DAO;

import com.pilot.humanresource.model.ReportId;
import com.pilot.humanresource.model.SalaryReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryReportRepository extends JpaRepository<SalaryReport, ReportId> {
}
