package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.PayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayroll;

import java.util.List;

public interface PayrollServiceInterface {
    EmployeePayroll add(PayrollDTO payrollDTO);
    List<EmployeePayroll> getAll();
    EmployeePayroll update(Integer id,PayrollDTO payrollDTO);
    EmployeePayroll getById(Integer id);
    void delete(Integer id);
}
