package com.bridgelabz.employeepayroll.dto;

import jakarta.validation.constraints.*;

public class PayrollDTO {
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Invalid Employee's First name")
    @NotEmpty
    public String firstName;
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Invalid Employee's Last name")
    @NotEmpty
    public String lastName;
    @Pattern(regexp = "^[A-Za-z]{3,}(([+]|[-]|[.])?[a-zA-Z0-9]+)?@[a-zA-Z0-9]{1,}+[.][a-zA-Z0-9]{3}([.]|[,])?([a-zA-Z]?)*$", message = "Follow the pattern")
    @NotEmpty
    public String email;
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Start from 6 to 9.And exactly 10 digit only")
    @NotNull
    public String phoneNumber;
    @NotEmpty(message = "This field can't be empty")
    public String address;
    @Min(value = 500, message = "Minimum Wage should be mote than 500")
    @NotNull
    public Double salary;
    @Pattern(regexp = "^(M|Male|male|F|female|Female)$", message = "Write any one (M,Male,male,F,Female,female)")
    @NotEmpty
    public String gender;
    @NotBlank(message = "profilePic cannot be Empty")
    public String profilePic;
    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-(200[0-9]|201[0-9]|202[0-3])$", message = "Follow the pattern dd-mm-yyyy and year between 2000 to 2023")
    @NotEmpty
    public String startDate;
    @NotEmpty(message = "Department should Not be Empty")
    public String department;
    @NotBlank(message = "Note can't be empty")
    public String notes;
}
