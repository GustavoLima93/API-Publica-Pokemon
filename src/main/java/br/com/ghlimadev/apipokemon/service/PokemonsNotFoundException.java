package br.com.ghlimadev.apipokemon.service;

public class PokemonsNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PokemonsNotFoundException(String msg) {
        super(msg);
    }

    public PokemonsNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
