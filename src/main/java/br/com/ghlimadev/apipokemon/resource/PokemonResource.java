package br.com.ghlimadev.apipokemon.resource;

import br.com.ghlimadev.apipokemon.domain.Pokemon;
import br.com.ghlimadev.apipokemon.dto.PokemonDTO;
import br.com.ghlimadev.apipokemon.service.PokemonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/pokemons")
public class PokemonResource {

    @Autowired
    private PokemonService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Pokemon>> findAll(@Valid @RequestParam("page") @NotBlank(message = "Informar Page") int page, @RequestParam("itemsPerPage") @NotBlank(message = "Informar quantidade por Page") int items) {
        PageRequest pageable = PageRequest.of(page, items, Sort.by(Sort.Direction.ASC, "id"));
        Page<Pokemon> list = service.fildAll(pageable);
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PokemonDTO> findById(@PathVariable int id) {
        Pokemon obj = service.findById(id);
        ModelMapper modelMapper = new ModelMapper(); // Criando mapper
        PokemonDTO pokemonDTO = modelMapper.map(obj, PokemonDTO.class); // Convertendo Pokemon para PokemonDTO
        return ResponseEntity.ok().body(pokemonDTO);
    }

    @RequestMapping(value = "/nome", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> searchbyName(@Valid @RequestParam("search") @NotBlank(message = "Informar Busca") String nome) {
        List<Pokemon> list = service.searchPokemonByNome(nome);
        ModelMapper modelMapper = new ModelMapper();
        List<PokemonDTO> listDto = list.stream().map(x -> modelMapper.map(x, PokemonDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }


}
