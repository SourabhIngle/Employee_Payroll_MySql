package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.PayrollDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity //Creating table in Database.
@Table(name = "Employee_Table") //This is for table name.
@Data
@NoArgsConstructor
public class EmployeePayroll {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private Double salary;
    private String gender;
    private String profilePic;
    private String startDate;
    private String department;
    private String notes;

    public EmployeePayroll(PayrollDTO payrollDTO){
        this.updateEmployee(payrollDTO);
    }
//    public EmployeePayroll(PayrollDTO payrollDTO) {
    public void updateEmployee(PayrollDTO payrollDTO) {
        this.firstName = payrollDTO.firstName;
        this.lastName = payrollDTO.lastName;
        this.email = payrollDTO.email;
        this.phoneNumber = payrollDTO.phoneNumber;
        this.address = payrollDTO.address;
        this.salary = payrollDTO.salary;
        this.gender = payrollDTO.gender;
        this.profilePic = payrollDTO.profilePic;
        this.startDate = payrollDTO.startDate;
        this.department = payrollDTO.department;
        this.notes = payrollDTO.notes;
    }
}
