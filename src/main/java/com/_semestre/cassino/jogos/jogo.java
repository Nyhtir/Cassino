package com._semestre.cassino.jogos;

import jakarta.persistence.*;
@MappedSuperclass
@Entity
abstract class jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int entrada;
    private String nomejogo;


    public jogo(String nomejogo, int entrada, long id) {
        this.nomejogo = nomejogo;
        this.entrada = entrada;
        this.id = id;
    }

    // Getters e Setters
    public long getId() {
        return id;
    }

    public int getEntrada() {
        return entrada;
    }

    public String getNomejogo() {
        return nomejogo;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setNomejogo(String nomejogo) {
        this.nomejogo = nomejogo;
    }

    abstract float premio(int entrada);

    public String descricao() {
        return "Jogo de cassino";
    }
}
