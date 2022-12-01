package com.sistemafaculdade.api.secretaria.controller;

import com.sistemafaculdade.api.secretaria.model.Disciplina;
import com.sistemafaculdade.api.secretaria.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/disciplina") //vai ser comunicar c o http atraves do endpoint /disciplina, ele vai responder todas as minhas requisições post para meu metodo create
public class DisciplinaController {

    @Autowired
    DisciplinaService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Disciplina> create(@RequestBody Disciplina disciplina){
        Disciplina disciplinaCreated = service.create(disciplina);

        return ResponseEntity.status(201).body(disciplinaCreated);
    }
}
