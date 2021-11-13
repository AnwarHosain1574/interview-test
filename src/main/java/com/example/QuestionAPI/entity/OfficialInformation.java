package com.example.QuestionAPI.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "official_information")
public class OfficialInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "salary_amount")
    private Double salaryAmount;

}
