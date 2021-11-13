package com.example.QuestionAPI.repository;

import com.example.QuestionAPI.entity.OfficialInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficialInformationRepository extends JpaRepository<OfficialInformation, Integer> {
}
