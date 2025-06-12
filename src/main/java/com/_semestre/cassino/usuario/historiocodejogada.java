package com._semestre.cassino.usuario;

import jakarta.persistence.*;

public class historiocodejogada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomejogo;
    private int entrada;
    private float premio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private usuariocassino usuario;

    public historiocodejogada(String nomejogo, int entrada, float premio) {
        this.nomejogo = nomejogo;
        this.entrada = entrada;
        this.premio = premio;
    }

    public String getNomejogo() {
        return nomejogo;
    }

    public int getEntrada() {
        return entrada;
    }

    public float getPremio() {
        return premio;
    }
}
