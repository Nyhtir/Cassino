package com._semestre.cassino;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class usuariocassino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id ;
    String nome ;
    String email ;
    int idade ;
    int saldo;

    public usuariocassino(String nome, String email, int idade, int saldo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.saldo = saldo;
    }
}
