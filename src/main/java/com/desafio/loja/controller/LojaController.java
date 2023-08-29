package com.desafio.loja.controller;

import com.desafio.loja.repositories.entities.Loja;
import com.desafio.loja.services.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping("/buscar")
    public List<Loja> buscarTodos(){
        return lojaService.findAll();
    }

    @DeleteMapping(value="/{id}")
    public void deleteLoja (@PathVariable Long id) {
        lojaService.deleteLoja(id);
    }

    @PostMapping("/cadastrar")
    public Loja salvarLoja(@RequestBody Loja loja){
        return lojaService.salvarLoja(loja);
    }


}
