package com.sistemafaculdade.api.secretaria.repositories;

import com.sistemafaculdade.api.secretaria.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
