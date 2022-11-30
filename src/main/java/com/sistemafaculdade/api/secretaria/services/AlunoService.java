package com.sistemafaculdade.api.secretaria.services;

import com.sistemafaculdade.api.secretaria.models.Aluno;
import com.sistemafaculdade.api.secretaria.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {



    @Autowired
    AlunoRepository repository;
    public Aluno create(Aluno aluno){
        return repository.save(aluno);


    }

    public List<Aluno> findAll(){ //criei um metodo que vai retornar uma lista de alunos
        return repository.findAll(); //n passei nada como parametro pq quero que passe tudo
    }

    public Optional<Aluno> findById(Long id){ //criei um metodo optional que permite retornar nulo pra evitar nullpointerexception
        return repository.findById(id); //passei como parametro o id para buscar por lá
    }

    public void delete(Long id ) { //metodo para deletar id
        repository.deleteById(id); //para deletar atraves do id
    }
}
