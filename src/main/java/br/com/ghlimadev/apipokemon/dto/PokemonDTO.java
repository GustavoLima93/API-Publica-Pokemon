package br.com.ghlimadev.apipokemon.dto;

import br.com.ghlimadev.apipokemon.domain.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PokemonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String altura;
    private String descricao;
    private List<Evolution> evolutions;
    private String genero;
    private String gif;
    private List<Habilidade> habilidades;
    private String img;
    private String nome;
    private Integer numeroDex;
    private String peso;
    private List<String> sprites;
    private List<Statu> status;
    private List<Tipo> tipo;

    public PokemonDTO() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Evolution> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Evolution> evolutions) {
        this.evolutions = evolutions;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDex() {
        return numeroDex;
    }

    public void setNumeroDex(Integer numeroDex) {
        this.numeroDex = numeroDex;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public List<String> getSprites() {
        return sprites;
    }

    public void setSprites(List<String> sprites) {
        this.sprites = sprites;
    }

    public List<Statu> getStatus() {
        return status;
    }

    public void setStatus(List<Statu> status) {
        this.status = status;
    }

    public List<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(List<Tipo> tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(getId(), pokemon.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
