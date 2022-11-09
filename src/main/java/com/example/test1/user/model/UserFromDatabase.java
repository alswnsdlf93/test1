package com.example.test1.user.model;

import lombok.Data;

@Data
public class UserFromDatabase {
    private Integer employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private Integer reportsTo;
    private String jobTitle;
}
