package br.com.ghlimadev.apipokemon.resource.exception;

import br.com.ghlimadev.apipokemon.service.PokemonsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

public class ResourceExceptionHandler {

    @ExceptionHandler(PokemonsNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(PokemonsNotFoundException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Not Found", e.getMessage());
        return ResponseEntity.status(status).body(err);
    }
}
