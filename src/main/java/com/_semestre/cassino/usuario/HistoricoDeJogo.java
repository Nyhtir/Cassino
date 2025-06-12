package com._semestre.cassino.usuario;

import com._semestre.cassino.usuario.UsuarioCassino;
import jakarta.persistence.*;

@Entity
public class HistoricoDeJogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeJogo;
    private int entrada;
    private float premio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioCassino usuario;

    public HistoricoDeJogo() {}

    public HistoricoDeJogo(String nomeJogo, int entrada, float premio) {
        this.nomeJogo = nomeJogo;
        this.entrada = entrada;
        this.premio = premio;
    }

    // Getters e Setters
    public String getNomeJogo() { return nomeJogo; }
    public void setNomeJogo(String nomeJogo) { this.nomeJogo = nomeJogo; }
    public int getEntrada() { return entrada; }
    public void setEntrada(int entrada) { this.entrada = entrada; }
    public float getPremio() { return premio; }
    public void setPremio(float premio) { this.premio = premio; }
    public UsuarioCassino getUsuario() { return usuario; }
    public void setUsuario(UsuarioCassino usuario) { this.usuario = usuario; }
}
