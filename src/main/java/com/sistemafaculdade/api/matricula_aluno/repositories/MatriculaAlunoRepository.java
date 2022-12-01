package com.sistemafaculdade.api.matricula_aluno.repositories;

import com.sistemafaculdade.api.matricula_aluno.models.MatriculaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long> {
}
