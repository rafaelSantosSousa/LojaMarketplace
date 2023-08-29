package com.desafio.loja.services;

import com.desafio.loja.repositories.ProdutoRepository;
import com.desafio.loja.repositories.entities.Cliente;
import com.desafio.loja.repositories.entities.Endereco;
import com.desafio.loja.repositories.entities.Loja;
import com.desafio.loja.repositories.entities.Produto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;


    @Transactional
    public Produto salvarProduto(Produto produto){
        Produto.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .valor(produto.getValor())
                .build();

        return produtoRepository.save(produto);
    }

    public List<Produto> buscarProdutos(){
        return produtoRepository.findAll();
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

}

