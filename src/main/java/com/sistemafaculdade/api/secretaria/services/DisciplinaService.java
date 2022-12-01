package com.sistemafaculdade.api.secretaria.services;

import com.sistemafaculdade.api.secretaria.models.Disciplina;
import com.sistemafaculdade.api.secretaria.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {
    @Autowired
    DisciplinaRepository repository;

    public Disciplina create(Disciplina disciplina){
        return repository.save(disciplina); //save no repository
    }
}
