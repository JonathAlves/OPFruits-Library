package com.jonathanguerra.opfruitslibrary.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "AKUMANOMI")
public class AkumaNoMi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME", nullable = false, length = 3000)
    private String nome;
    @Column(name = "TIPO", nullable = false, length = 3000)
    private String tipo;
    @Column(name = "DESCRICAO", nullable = false, length = 3000)
    private String descricao;

    public AkumaNoMi(Long id, String nome, String tipo, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public AkumaNoMi() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
