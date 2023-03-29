package com.example.registroAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos", schema = "public")
public class Contato {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "tipo", nullable = false, length = 8)
    private String tipo;
    @Getter @Setter
    @Column(name = "valor", nullable = false, length = 50)
    private String valor;
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "aluno", nullable = false)
    private Aluno aluno;
}
