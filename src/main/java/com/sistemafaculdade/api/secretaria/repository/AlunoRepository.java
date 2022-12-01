package com.sistemafaculdade.api.secretaria.repository;

import com.sistemafaculdade.api.secretaria.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}
