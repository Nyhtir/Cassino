package com._semestre.cassino.jogos;

import jakarta.persistence.Entity;


@Entity
public class roleta extends jogo{
    public roleta(String nomejogo, int entrada, long id) {
        super(nomejogo, entrada, id);
    }

    @Override
    float premio(int entrada) {
        return entrada * 1.5f;
    }
}