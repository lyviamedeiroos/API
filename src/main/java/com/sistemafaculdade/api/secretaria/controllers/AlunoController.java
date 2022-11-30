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
@RequestMapping("/alunos")  // mapear a url que vai comunicar com essa entidade via http, coloquei como parametro /alunos pq tenho que mapear tudo que fiz de alunos
public class AlunoController {

    @Autowired //pra injetar o service no meu controller
    AlunoService service; //objeto service do tipo AlunoService

    //estou habilitado no meu controller a criar um metodo create
    //criei um metodo que vai retornar uma resposta da minha requisição http(ResponseEntity) e passo como parametro a minha entidade aluno que criei no models.
    //no metodo create passo como parametro o meu body da minha requisição http, pq como o controller recebe e devolve o status para o cliente, entao ele tem que receber isso no formato que o http entende e o http vai levar os dados do aluno atraves do corpo da requisição http. entao a sintaxe é (RequestBody) de Aluno, eu num ja fiz o corpo de aluino na classe models.
    //e vai ser o tipo da variavel do meu parametro aluno
    // eu chamo aluno created do tipo aluno que vai receber o service.create, como o service foi injetado eu posso chamar o metodo create do service e levo como parametro aluno.
    @PostMapping //informando ao spring boot que esse metodo é um metodo post
    @ResponseStatus(HttpStatus.CREATED) //pra retornar o status padrão de um post bem sucedido
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno alunoCreated = service.create(aluno); //aluno crated pq eu sei que o meu service retorna um aluno

        return ResponseEntity.status(201).body(alunoCreated); //o retorno do meu metodo tem que ser responseEntity, passo o status 201 pq um post bem sucedido tem um statuscode 201 e no corpo da resposta eu passo o aluno created

    }
    @GetMapping("/all") //pra mapear tudo
    @ResponseStatus(HttpStatus.OK) // pra retornar o status
    public List<Aluno> findAll(){ //metodo para trazer todos os alunos atraves de uma lista
        return service.findAll();
    }

    @GetMapping("/{id}")// pra mapear atraves do id
    @ResponseStatus(HttpStatus.OK) //pra retornar o status
    public Optional<Aluno> findById(@PathVariable Long id){ //o postman vai passar como parametro da requisição o proprio id
        return service.findById(id);
    }

    @DeleteMapping("/{id}") // pra deletar atraves do id
    @ResponseStatus(HttpStatus.NO_CONTENT) //status de sem conteudo
    public void delete(@PathVariable Long id){ //metodo para deletar atraves do id
        service.delete(id);
    }


}
