package com.sistemafaculdade.api.alunomatricula.service;

import com.sistemafaculdade.api.alunomatricula.model.MatriculaAluno;
import com.sistemafaculdade.api.alunomatricula.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {


    @Autowired
    MatriculaAlunoRepository repository;

    public MatriculaAluno create(MatriculaAluno matriculaAluno){
        matriculaAluno.setStatus("MATRICULADO");
        return repository.save(matriculaAluno);
    }

}
