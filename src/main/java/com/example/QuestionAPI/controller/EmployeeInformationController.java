package com.example.QuestionAPI.controller;

import com.example.QuestionAPI.entity.EmployeInformation;
import com.example.QuestionAPI.service.EmployeeInformationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee-information")
//@AllArgsConstructor
public class EmployeeInformationController {

    @Autowired
    private EmployeeInformationService service;

    @PostMapping
    public EmployeInformation save(@RequestBody EmployeInformation entity){
            return  service.save(entity);
    }

    @PutMapping
    public EmployeInformation update(@RequestBody EmployeInformation entity){
        return service.update(entity);
    }

    @DeleteMapping
    public EmployeInformation delete(@RequestBody EmployeInformation entity){
        return service.delete(entity);
    }

    @GetMapping
    public List<EmployeInformation> findAll(){
        return service.getAll();
    }

}
