package com.bridgelabz.employeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollApplication.class, args);
        log.info("Welcome to Spring Demo");
        log.debug("Debug level");
        log.warn("Warn level");
        log.error("Error level");
    }
}
