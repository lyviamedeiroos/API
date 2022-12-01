package com.sistemafaculdade.api.secretaria.repositories;

import com.sistemafaculdade.api.secretaria.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
