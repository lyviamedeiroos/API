package com.sistemafaculdade.api.secretaria.services;

import com.sistemafaculdade.api.secretaria.models.Professor;
import com.sistemafaculdade.api.secretaria.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;


    public Professor create(Professor professor){
        return repository.save(professor);
    }
}
