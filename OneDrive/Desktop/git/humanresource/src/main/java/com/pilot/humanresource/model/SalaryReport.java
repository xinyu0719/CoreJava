package com.pilot.humanresource.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salary_report")
public class SalaryReport {
    @Id
    private String job;
    private String department;
    private double salmin;
    private double salmax;
    private double salavg;
    private double saltotal;
    private int empcount;
    private Date updatetime;

}
