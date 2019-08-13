package br.com.ghlimadev.apipokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result  implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Pokemon> result;

    public Result() {
    }

    public List<Pokemon> getResult() {
        return result;
    }

    public void setResult(List<Pokemon> result) {
        this.result = result;
    }

}
