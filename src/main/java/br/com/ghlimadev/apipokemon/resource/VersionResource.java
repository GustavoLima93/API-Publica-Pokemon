package br.com.ghlimadev.apipokemon.resource;

import br.com.ghlimadev.apipokemon.dto.VersionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class VersionResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<VersionDTO> version() {
        VersionDTO version = new VersionDTO("API POKEMON- MongoDB/SpringBoot","V2","Gustavo Lima", "https://github.com/GustavoLima93");

        return ResponseEntity.ok().body(version);
    }
}
