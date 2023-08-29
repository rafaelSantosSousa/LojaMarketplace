package com.desafio.loja.controller;

import com.desafio.loja.repositories.entities.Produto;
import com.desafio.loja.repositories.entities.Seller;
import com.desafio.loja.services.ClienteService;
import com.desafio.loja.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;


    @GetMapping("/buscar")
    public List<Produto> buscarTodos(){
        return produtoService.buscarProdutos();
    }

    @PostMapping("/cadastrar")
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }

    @DeleteMapping(value="/{id}")
    public void delete (@PathVariable Long id) {
        produtoService.delete(id);
    }
}
