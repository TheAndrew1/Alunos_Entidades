package com.example.registroAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "cursos", schema = "public")
public class Curso {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 15, unique = true)
    private String nome;
    @Getter @Setter
    @Column(name = "carga_horaria", nullable = false)
    private Time cargaHoraria;
    @Getter @Setter
    @ManyToMany
    @JoinColumn(name = "aluno")
    private List<Aluno> alunos;
}
