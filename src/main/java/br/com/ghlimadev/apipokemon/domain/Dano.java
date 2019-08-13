package br.com.ghlimadev.apipokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dano implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> dano_duplo_de;
    private List<String> duplo_dano_a;
    private List<String> meio_dano_a;
    private List<String> metade_do_dano_de;

    public Dano() {
    }

    public List<String> getDano_duplo_de() {
        return dano_duplo_de;
    }

    public void setDano_duplo_de(List<String> dano_duplo_de) {
        this.dano_duplo_de = dano_duplo_de;
    }

    public List<String> getDuplo_dano_a() {
        return duplo_dano_a;
    }

    public void setDuplo_dano_a(List<String> duplo_dano_a) {
        this.duplo_dano_a = duplo_dano_a;
    }

    public List<String> getMeio_dano_a() {
        return meio_dano_a;
    }

    public void setMeio_dano_a(List<String> meio_dano_a) {
        this.meio_dano_a = meio_dano_a;
    }

    public List<String> getMetade_do_dano_de() {
        return metade_do_dano_de;
    }

    public void setMetade_do_dano_de(List<String> metade_do_dano_de) {
        this.metade_do_dano_de = metade_do_dano_de;
    }
}
