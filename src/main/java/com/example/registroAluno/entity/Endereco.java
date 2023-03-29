package com.example.registroAluno.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enderecos", schema = "public")
public class Endereco {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "rua", nullable = false, length = 30)
    private String rua;
    @Getter @Setter
    @Column(name = "numero", nullable = false)
    private int numero;
    @Getter @Setter
    @Column(name = "bairro", nullable = false, length = 30)
    private String bairro;
    @Getter @Setter
    @Column(name = "cep", nullable = false, length = 9)
    private String cep;
}
