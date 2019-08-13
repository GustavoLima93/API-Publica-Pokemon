package br.com.ghlimadev.apipokemon.dto;

import java.io.Serializable;

public class VersionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String versao;
    private String author;
    private String github;

    public VersionDTO() {
    }

    public VersionDTO(String nome, String versao, String author, String github) {
        this.nome = nome;
        this.versao = versao;
        this.author = author;
        this.github = github;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
