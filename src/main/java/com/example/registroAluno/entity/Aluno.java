package com.example.registroAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "alunos", schema = "public")
public class Aluno {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;
    @Getter @Setter
    @OneToOne
    @JoinColumn(name = "endereco", nullable = false)
    private Endereco endereco;
}
