/*

// Metodo Init responsavel por consumir API Node/FireBase e popular MongoDB

package br.com.ghlimadev.apipokemon.config;


import br.com.ghlimadev.apipokemon.domain.Pokemon;
import br.com.ghlimadev.apipokemon.domain.Result;
import br.com.ghlimadev.apipokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    PokemonRepository repo;

    @Override
	  public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        Result pokemons =  restTemplate.getForObject("http://localhost:3050/api/v2/pokemons", Result.class);

        Integer id = 0;

        for (Pokemon obj: pokemons.getResult()
             ) {
            if(obj.getId() == null) {
                obj.setId(id);
                repo.save(obj);
            }

            System.out.println(id.toString());
            id++;


        }

    }
}

*/

