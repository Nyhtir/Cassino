package com._semestre.cassino.usuario;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class usuariocassino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nome ;
    private String email ;
    private int idade ;
    private int saldo;

    public usuariocassino(String nome, String email, int idade, int saldo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.saldo = saldo;
    }
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<historiocodejogada> historico = new ArrayList<>();

    public void adicionarJogo(String nomeJogo, int entrada, float premio) {
        historiocodejogada historicoJogo = new historiocodejogada(nomeJogo, entrada, premio);
        historico.add(historicoJogo);
    }


    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public int getidade() {
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public int getsaldo() {
        return saldo;
    }
    public void setsaldo(int saldo) {
        this.saldo = saldo;
    }
}
