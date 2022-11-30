package com.sistemafaculdade.api.secretaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //meu valor vai ser gerado a partir da estrategia do generation type.identity pq vai trazer o incremento de um e um p meu id
    private Long id; //primary key

    private String nome;

    private String email;

    private String curso;

}
