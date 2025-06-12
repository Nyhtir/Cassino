package com._semestre.cassino.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("Boas vindas")
    public String boasvindas(){
        return "Bem-vindo ao Cassino!";

    }

}
