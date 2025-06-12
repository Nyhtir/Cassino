package com._semestre.cassino;

import jakarta.persistence.*;

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
