package com.example.QuestionAPI.service;

import com.example.QuestionAPI.entity.OfficialInformation;
import com.example.QuestionAPI.repository.OfficialInformationRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class OfficialInformationServiceImp implements OfficialInformationService {

    private OfficialInformationRepository repo;

    @Override
    public OfficialInformation save(OfficialInformation entity) {
        return repo.save(entity);
    }

    @Override
    public OfficialInformation update(OfficialInformation entity) {
        return repo.save(entity);
    }

    @Override
    public OfficialInformation delete(OfficialInformation entity) {
        repo.delete(entity);
        return null;
    }

    @Override
    public List<OfficialInformation> getAll() {
        return repo.findAll();
    }
}
