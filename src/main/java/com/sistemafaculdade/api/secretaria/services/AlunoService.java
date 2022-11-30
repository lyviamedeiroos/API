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
    public Aluno create(Aluno aluno){ //criei um metodo create para criar um aluno no meu banco de dados, portanto esse metodo vai retornar um aluno e como logo depois o controller vai se comunicar
        return repository.save(aluno);//com o service, ele vai passar como parametro aluno
                                      //como o service se comunica com o repository, eu quero que ele retorne repository.save pq ele é a o cara que vai se comunicar com o banco de dados,
                                     // levando como parametro o aluno que ele recebeu no controller
    }

    public List<Aluno> findAll(){ //criei um metodo que vai retornar uma lista de alunos
        return repository.findAll(); //n passei nada como parametro pq quero que passe tudo
    }

    public Optional<Aluno> findById(Long id){ //criei um metodo optional que permite retornar nulo pra evitar nullpointer exception e vai retornar o objeto que eu quero a partir do meu id
        return repository.findById(id); //passei como parametro o id para buscar por lá
    }

    public void delete(Long id ) { //metodo para deletar id
        repository.deleteById(id); //para deletar atraves do id
    }
}
