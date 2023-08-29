package com.desafio.loja.services;

import com.desafio.loja.repositories.EnderecoRepository;
import com.desafio.loja.repositories.LojaRepository;
import com.desafio.loja.repositories.SellerRepository;
import com.desafio.loja.repositories.entities.Endereco;
import com.desafio.loja.repositories.entities.Loja;
import com.desafio.loja.repositories.entities.Seller;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService  {
    @Autowired
    private LojaRepository lojaRepository;
    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Transactional
    public Seller salvarSeller(Seller seller){

        Endereco enderecoSeller = enderecoRepository.save(seller.getEndereco());
        seller.setEndereco(enderecoSeller);
        return sellerRepository.save(seller);
    }

    public List<Seller> findAll(){
        return sellerRepository.findAll();
    }

    public void delete(Long id) {
        sellerRepository.deleteById(id);
    }


}


