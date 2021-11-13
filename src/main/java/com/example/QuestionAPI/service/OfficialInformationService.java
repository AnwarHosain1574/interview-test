package com.example.QuestionAPI.service;

import com.example.QuestionAPI.entity.OfficialInformation;

import java.util.List;

public interface OfficialInformationService {
    OfficialInformation save(OfficialInformation entity);
    OfficialInformation update(OfficialInformation entity);
    OfficialInformation delete(OfficialInformation entity);
    List<OfficialInformation> getAll();
}
