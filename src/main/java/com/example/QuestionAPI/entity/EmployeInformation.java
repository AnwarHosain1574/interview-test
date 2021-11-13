package com.example.QuestionAPI.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "employee_information")
public class EmployeInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "identity_number")
    private String identityNumber;



}
