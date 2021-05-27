package br.com.senai.api.controller;

import br.com.senai.domain.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PessoaController {

    @GetMapping("/pessoas")
    public List<Pessoa> listar(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setId(1L);
        pessoa1.setNome("Johnatan");
        pessoa1.setEmail("johnatan@gmail.com");
        pessoa1.setTelefone("(47)98472-7610");

        Pessoa pessoa2 = new Pessoa(
                2L,
                "Mayara",
                "mayara@gmail.com",
                "(47)98877-5544"
        );

        return Arrays.asList(pessoa1, pessoa2);
    }
}
