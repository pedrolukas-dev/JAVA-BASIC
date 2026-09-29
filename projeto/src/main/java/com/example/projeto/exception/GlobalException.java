package com.example.projeto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    // Este método "apanha" qualquer IllegalArgumentException lançada na API
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgumentException(IllegalArgumentException ex) {

        // Devolve o erro num formato JSON limpo com a mensagem que definiu no Service
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST) // Erro 400 em vez de 500
                .body(Map.of("erro", ex.getMessage()));
    }
    @ExceptionHandler
}