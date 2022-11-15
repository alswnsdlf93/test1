package com.example.test1.user.model;

import lombok.Data;

@Data
public class UserFromDatabase {
    private Integer employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private Integer officeCode;
    private Integer reportsTo;
    private String jobTitle;
}
