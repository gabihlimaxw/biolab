package com.example.futebol.controllers;

import com.example.futebol.entities.Selecao;
import org.springframework.web.bind.annotation.*;
import com.example.futebol.repositories.SelecaoRepository;

import java.util.List;

@RestController
public class SelecaoController {

    private final SelecaoRepository selecaoRepository;

    public SelecaoController(SelecaoRepository selecaoRepository) {
        this.selecaoRepository = selecaoRepository;
    }

    @PostMapping("/a")
    public String criarSelecao(@RequestBody Selecao selecao) {
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaoRepository.save(s);
        return "Salvo com sucesso!!";
    }

    @PostMapping(value = "teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao) {
        Selecao s = new Selecao(selecao.getNome(),selecao.getUniforme(),selecao.getMascote());
        selecaoRepository.save(s);
        return s;
    }

    @GetMapping
    public List<Selecao> mostrarSelecao(){
        List<Selecao> listaSelecao= selecaoRepository.findAll();
        return listaSelecao;
    }
}
