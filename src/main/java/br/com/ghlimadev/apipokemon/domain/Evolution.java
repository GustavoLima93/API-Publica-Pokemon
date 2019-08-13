package br.com.ghlimadev.apipokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evolution implements Serializable {

    private static final long serialVersionUID = 1L;

    private String img;
    private String numberoDex;
    private String pokemon;

    public Evolution() {
    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNumberoDex() {
        return numberoDex;
    }

    public void setNumberoDex(String numberoDex) {
        this.numberoDex = numberoDex;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

}
