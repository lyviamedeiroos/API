package com.sistemafaculdade.api.alunomatricula.repository;

import com.sistemafaculdade.api.alunomatricula.model.MatriculaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long> {
}
