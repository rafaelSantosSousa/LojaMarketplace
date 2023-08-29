package com.desafio.loja.services;

import com.desafio.loja.repositories.ClienteRepository;
import com.desafio.loja.repositories.EnderecoRepository;
import com.desafio.loja.repositories.LojaRepository;
import com.desafio.loja.repositories.entities.Cliente;
import com.desafio.loja.repositories.entities.Endereco;
import com.desafio.loja.repositories.entities.Loja;
import com.desafio.loja.repositories.entities.Seller;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    @Autowired
    private LojaRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional
    public Loja salvarLoja(Loja loja){

        Loja.builder()
                .id(loja.getId())
                .nome(loja.getNome())
                .ativo(loja.getAtivo())
                .build();

        Endereco endereco = enderecoRepository.save(loja.getEndereco());
        loja.setEndereco(endereco);

       return repository.save(loja);
    }

    public void deleteLoja(Long id) {
        repository.deleteById(id);
    }

    public List<Loja> findAll(){
        return repository.findAll();
    }


}