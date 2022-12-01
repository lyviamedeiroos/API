package com.sistemafaculdade.api.secretaria.service;

import com.sistemafaculdade.api.secretaria.model.Aluno;
import com.sistemafaculdade.api.secretaria.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {


    AlunoRepository repository;

    @Autowired
    public AlunoService(AlunoRepository r){
        this.repository = r;
    }

    public Aluno create(Aluno aluno){
        return repository.save(aluno);

    }

    public List<Aluno> findAll(){ //criei um metodo que vai retornar uma lista de alunos

        return repository.findAll(); //n passei nada como parametro pq quero que passe tudo
    }

    public Aluno findById(Long id){  //criei um metodo optional que permite retornar nulo pra evitar nullpointerexception

        Optional<Aluno> aluno = repository.findById(id);
        if (aluno.isPresent()){
            return aluno.get();
        }
        return null;

    }

    public void delete(Long id ) { //metodo para deletar id
        repository.deleteById(id);
    }

    public void deleteAll(){ // metodo para deletar tudo
        repository.deleteAll();
    }
}
