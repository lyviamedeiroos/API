package com.sistemafaculdade.api.secretaria.repository;

import com.sistemafaculdade.api.secretaria.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
