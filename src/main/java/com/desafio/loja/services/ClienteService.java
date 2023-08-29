package com.desafio.loja.services;

import com.desafio.loja.repositories.ClienteRepository;
import com.desafio.loja.repositories.EnderecoRepository;
import com.desafio.loja.repositories.entities.Cliente;
import com.desafio.loja.repositories.entities.Endereco;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional
    public Cliente salvarCliente(Cliente cliente){
        Endereco endereco = enderecoRepository.save(cliente.getEndereco());
        cliente.setEndereco(endereco);
        return repository.save(cliente);
    }

    public List<Cliente> buscarClientes(){
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
