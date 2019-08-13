package br.com.ghlimadev.apipokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tipo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Dano danos;
    private String nome;


    public Tipo() {
    }

    public Dano getDanos() {
        return danos;
    }

    public void setDanos(Dano danos) {
        this.danos = danos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
