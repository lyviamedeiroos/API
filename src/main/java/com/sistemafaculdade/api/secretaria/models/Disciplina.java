package com.sistemafaculdade.api.secretaria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne //relacionamento entre entidade, (N:1)
    @JoinColumn(name = "professor_id") //preciso conectar disciplina c prof pq toda disciplina tem um professor, então fiz um join entre duas colunas
    private Professor professor;
}
