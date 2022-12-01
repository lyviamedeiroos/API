package com.sistemafaculdade.api.secretaria.controllers;

import com.sistemafaculdade.api.secretaria.models.Aluno;
import com.sistemafaculdade.api.secretaria.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //o controller tem que ter uma caracteristica de comunicação via rest, http.
@RequestMapping("/alunos")  // mapear a url que vai comunicar com essa entidade via http, coloquei como parametro /alunos
public class AlunoController {

    @Autowired //pra injetar o service no meu controller
    AlunoService service; //objeto service do tipo AlunoService


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //pra retornar o status padrão de um post bem sucedido
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno alunoCreated = service.create(aluno);

        return ResponseEntity.status(201).body(alunoCreated); //passando statuscode 201

    }
    @GetMapping("/all") //pra mapear tudo
    @ResponseStatus(HttpStatus.OK) //
    public List<Aluno> findAll(){ 
        return service.findAll();
    }

    @GetMapping("/{id}")// pra mapear atraves do id
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> findById(@PathVariable Long id){ //o postman vai passar como parametro da requisição o proprio id
        return service.findById(id);
    }

    @DeleteMapping("/{id}") // pra deletar atraves do id
    @ResponseStatus(HttpStatus.NO_CONTENT) //status de sem conteudo
    public void delete(@PathVariable Long id){ //metodo para deletar atraves do id
        service.delete(id);
    }

    @DeleteMapping("/all")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll(){ //implementei um metodo pra deletar tudo do banco (???????)
       service.deleteAll();
    }


}
