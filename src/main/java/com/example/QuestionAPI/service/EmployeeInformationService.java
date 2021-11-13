package com.example.QuestionAPI.service;

import com.example.QuestionAPI.entity.EmployeInformation;

import java.util.List;

public interface EmployeeInformationService {
    EmployeInformation save(EmployeInformation entity);
    EmployeInformation update(EmployeInformation entity);
    EmployeInformation delete(EmployeInformation entity);
    List<EmployeInformation> getAll();
}
