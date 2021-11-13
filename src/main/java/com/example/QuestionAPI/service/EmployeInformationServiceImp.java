package com.example.QuestionAPI.service;

import com.example.QuestionAPI.entity.EmployeInformation;
import com.example.QuestionAPI.repository.EmployeeInformationRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@NoArgsConstructor
public class EmployeInformationServiceImp implements EmployeeInformationService {

    @Autowired
    private EmployeeInformationRepository repo;

    @Override
    public EmployeInformation save(EmployeInformation entity) {
        return repo.save(entity);
    }

    @Override
    public EmployeInformation update(EmployeInformation entity) {
        return repo.save(entity);
    }

    @Override
    public EmployeInformation delete(EmployeInformation entity) {
        repo.delete(entity);
        return null;
    }

    @Override
    public List<EmployeInformation> getAll() {
        return repo.findAll();
    }
}
