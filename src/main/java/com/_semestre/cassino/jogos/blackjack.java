package com._semestre.cassino.jogos;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
public class blackjack extends jogo{
    public blackjack(String nomejogo, int entrada, long id) {
        super(nomejogo, entrada, id);
    }
    @Override
    float premio(int entrada) {
        return entrada * 1.7f;
    }


}
