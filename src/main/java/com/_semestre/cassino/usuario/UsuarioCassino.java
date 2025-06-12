package com._semestre.cassino.usuario;

import com._semestre.cassino.usuario.HistoricoDeJogo;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class UsuarioCassino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @Min(18)
    private int idade;

    private int saldo;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricoDeJogo> historico = new ArrayList<>();

    public UsuarioCassino() {}

    public UsuarioCassino(String nome, String email, int idade, int saldo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.saldo = saldo;
    }

    public void adicionarHistorico(HistoricoDeJogo jogo) {
        historico.add(jogo);
        jogo.setUsuario(this);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { this.saldo = saldo; }
    public List<HistoricoDeJogo> getHistorico() { return historico; }
    public void setId(long id) {
        this.id = id;
    }
}