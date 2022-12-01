package com.sistemafaculdade.api.matricula_aluno.services;

import com.sistemafaculdade.api.matricula_aluno.models.MatriculaAluno;
import com.sistemafaculdade.api.matricula_aluno.repositories.MatriculaAlunoRepository;
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
