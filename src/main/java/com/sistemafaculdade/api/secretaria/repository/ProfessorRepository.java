package com.sistemafaculdade.api.secretaria.repository;

import com.sistemafaculdade.api.secretaria.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
