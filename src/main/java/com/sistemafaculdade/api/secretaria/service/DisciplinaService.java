package com.sistemafaculdade.api.secretaria.service;

import com.sistemafaculdade.api.secretaria.model.Disciplina;
import com.sistemafaculdade.api.secretaria.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    DisciplinaRepository repository;

    @Autowired
    public DisciplinaService(DisciplinaRepository r){
        this.repository = r;
    }

    public Disciplina create(Disciplina disciplina){
        return repository.save(disciplina); //save no repository
    }
}
