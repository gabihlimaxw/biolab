package com.example.biolab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @GetMapping(name = "/msg")
    public String mostrarMsg(){
        return "Olá Mundo";
    }

    @PostMapping
    public String criar(@RequestBody String nome , String email){
        return "Criado com Sucesso , O nome e o email são"
                + nome + email;
    }
}
