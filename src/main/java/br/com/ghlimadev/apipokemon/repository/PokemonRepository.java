package br.com.ghlimadev.apipokemon.repository;

import br.com.ghlimadev.apipokemon.domain.Pokemon;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, String> {

    Page<Pokemon> findAll(Pageable page);

    Optional<Pokemon> findByNumeroDex(Integer id);

    @Query("{'nome' : { $regex: ?0, $options: 'i'}}")
    List<Pokemon> searchByName(String name);

}
