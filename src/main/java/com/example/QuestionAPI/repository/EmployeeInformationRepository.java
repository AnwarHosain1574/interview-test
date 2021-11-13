package com.example.QuestionAPI.repository;

import com.example.QuestionAPI.entity.EmployeInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInformationRepository extends JpaRepository<EmployeInformation, Integer> {
}
