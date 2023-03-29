package com.example.registroAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "professores", schema = "public")
public class Professor {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Getter @Setter
    @OneToMany
    @JoinTable(name = "professor_aluno", uniqueConstraints = @UniqueConstraint(columnNames = {"professor_id", "aluno_id"}), joinColumns = @JoinColumn(name = "professor_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Aluno> alunos;
}
