package com.sistemafaculdade.api.secretaria.service;

import com.sistemafaculdade.api.secretaria.model.Professor;
import com.sistemafaculdade.api.secretaria.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {


    ProfessorRepository repository;

    @Autowired
    public ProfessorService(ProfessorRepository r){ //injetando o repository atraves de um construtor
        this.repository = r;
    }


    public Professor create(Professor professor){
        return repository.save(professor);
    }
}
