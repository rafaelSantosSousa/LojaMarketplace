package com.desafio.loja.controller;

import com.desafio.loja.repositories.entities.Seller;
import com.desafio.loja.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService service;


    @GetMapping("/buscar")
    public List<Seller> buscarTodos(){
        return service.findAll();
    }

    @PostMapping("/cadastrar")
    public Seller salvarSeller(@RequestBody Seller seller){
        return service.salvarSeller(seller);
    }

    @DeleteMapping(value="/{id}")
    public void delete (@PathVariable Long id) {
        service.delete(id);
    }

}
