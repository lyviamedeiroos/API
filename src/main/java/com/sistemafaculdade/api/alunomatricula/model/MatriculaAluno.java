package com.sistemafaculdade.api.alunomatricula.model;

import com.sistemafaculdade.api.secretaria.model.Aluno;
import com.sistemafaculdade.api.secretaria.model.Disciplina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MatriculaAluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double nota1;
                                    //cada matricula representa um aluno, portanto as notas sao de acordo c a matricula
    private Double nota2;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    private String status; //cada matricula vai ter alguns status (matriculado, reprovado, aprovado, trancado)
}
