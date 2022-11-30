package com.sistemafaculdade.api.secretaria.controllers;

import com.sistemafaculdade.api.secretaria.models.Professor;
import com.sistemafaculdade.api.secretaria.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService service;
    @PostMapping

    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Professor> create(@RequestBody Professor professor){
        Professor professorCreated = service.create(professor);

        return ResponseEntity.status(201).body(professorCreated);
    }







}
