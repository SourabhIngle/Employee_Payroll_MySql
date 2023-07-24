package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.PayrollDTO;
import com.bridgelabz.employeepayroll.exception.CustomException;
import com.bridgelabz.employeepayroll.model.EmployeePayroll;
import com.bridgelabz.employeepayroll.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollService implements PayrollServiceInterface {

    @Autowired
    private Repository repository;

    @Override
    public EmployeePayroll add(PayrollDTO payrollDTO) {
        EmployeePayroll employeePayroll = new EmployeePayroll(payrollDTO);
        return repository.save(employeePayroll);
    }

    @Override
    public List<EmployeePayroll> getAll() {
        return repository.findAll();
    }

    @Override
    public EmployeePayroll getById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new CustomException("Employee payroll id: " + id + " Not Present"));

    }

    @Override
    public EmployeePayroll update(Integer id, PayrollDTO payrollDTO) {
        EmployeePayroll getId = getById(id);
        if (getId != null)
            getId.updateEmployee(payrollDTO);
        return repository.save(getId);
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
