package com._semestre.cassino.jogos;

import jakarta.persistence.Entity;


@Entity
public class poquer extends jogo {
    public poquer(String nomejogo, int entrada, long id) {
        super(nomejogo, entrada, id);
    }

    @Override
    float premio(int entrada) {
        return entrada * 1.8f;
    }

}
