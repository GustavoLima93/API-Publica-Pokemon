package br.com.ghlimadev.apipokemon.service;

import br.com.ghlimadev.apipokemon.domain.Pokemon;
import br.com.ghlimadev.apipokemon.dto.PokemonDTO;
import br.com.ghlimadev.apipokemon.repository.PokemonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Repository
public class PokemonService {

    @Autowired
    private PokemonRepository repo;

    public Pokemon insert(Pokemon obj) {
        return repo.insert(obj);
    }

    public Page<Pokemon> fildAll(Pageable page) {
        return repo.findAll(page);
    }

    public Pokemon findById(Integer id) {
        Optional<Pokemon> pokemon = repo.findByNumeroDex(id);
        return pokemon.orElseThrow(() -> new PokemonsNotFoundException("Pokemon não encontrado")); // Retornando pokemonDTO or Exception
    }

    public List<Pokemon> searchPokemonByNome(String name) {
        return repo.searchByName(name);
    }


}
