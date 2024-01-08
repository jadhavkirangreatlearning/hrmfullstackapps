package com.csi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Size(min = 2, message = "Employee Name should be atleast 2 character")
    private String empName;

    private String empAddress;

    private double empSalary;

    @Column(unique = true)
    @Email(message = "Email ID must be valid")
    private String empEmailId;


}
