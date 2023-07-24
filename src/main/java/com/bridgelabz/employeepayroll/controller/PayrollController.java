package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.PayrollDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayroll;
import com.bridgelabz.employeepayroll.service.PayrollServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayrollController {

    @Autowired
    private PayrollServiceInterface employeeServiceInterface;

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> add(@Valid @RequestBody PayrollDTO payrollDTO) {
        ResponseDTO responseDTO = new ResponseDTO("Data Add Successfully", employeeServiceInterface.add(payrollDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<ResponseDTO> getById(@PathVariable Integer id) {
        ResponseDTO responseDTO = new ResponseDTO("Data Fetched Successfully", employeeServiceInterface.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.FOUND);
    }

    @GetMapping("/getall")
    public List<EmployeePayroll> getAll() {
        return employeeServiceInterface.getAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> update(@PathVariable Integer id, @Valid @RequestBody PayrollDTO payrollDTO) {
        EmployeePayroll employeePayroll = employeeServiceInterface.update(id, payrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Update Successfully", employeePayroll);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        employeeServiceInterface.delete(id);
        return ResponseEntity.ok("Id " + id + " has been Successfully deleted");
    }
}
