package com.adrianoserralheria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador de testes REST para a Adriano Serralheria.
 * A anotação @RestController converte o retorno dos métodos diretamente em respostas HTTP JSON/Texto.
 */
@RestController
@RequestMapping("/api")
public class OlaMundoController {

    /**
     * Rota de Boas-Vindas da Serralheria.
     * Endereço para teste: http://localhost:8080/api/boas-vindas
     */
    @GetMapping("/boas-vindas")
    public String dizerOla() {
        return "Servidor da Adriano Serralheria rodando perfeitamente com Java 17 e Spring Boot!";
    }
}