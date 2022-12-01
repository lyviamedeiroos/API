package com.sistemafaculdade.api.secretaria.controller;

import com.sistemafaculdade.api.secretaria.model.Aluno;
import com.sistemafaculdade.api.secretaria.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //o controller tem que ter uma caracteristica de comunicação via rest, http.
@RequestMapping("/alunos")  // mapear a url que vai comunicar com essa entidade via http, coloquei como parametro /alunos
public class AlunoController {


    AlunoService service; //objeto service do tipo AlunoService

    @Autowired  //pra injetar o service no meu controller
    public AlunoController( AlunoService service){
        this.service = service;
    }


    @PostMapping
   // @ResponseStatus(HttpStatus.CREATED) //pra retornar o status padrão de um post bem sucedido
    public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
        Aluno alunoCreated = service.create(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).body(alunoCreated); //passando statuscode 201

    }
    @GetMapping("/all") //pra mapear tudo
   // @ResponseStatus(HttpStatus.OK) //
    public List<Aluno> findAll(){ //metodo para trazer todos os alunos atraves de uma lista
        return service.findAll();
    }

    @GetMapping("/{id}")// pra mapear atraves do id
  //  @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> findById(@PathVariable Long id){ //o postman vai passar como parametro da requisição o proprio id
//        return service.findById(id);
        if (service.findById(id) == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
            }
        Aluno aluno = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(aluno);
    }

    @DeleteMapping("/{id}") // pra deletar atraves do id
 //   @ResponseStatus(HttpStatus.NO_CONTENT) //status de sem conteudo
    public void delete(@PathVariable Long id){ //metodo para deletar atraves do id
        service.delete(id);
    }

    @DeleteMapping("/all")
  //  @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll(){ //implementei um metodo pra deletar tudo do banco (???????)
       service.deleteAll();
    }


}
