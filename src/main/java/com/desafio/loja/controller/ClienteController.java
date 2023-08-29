package com.desafio.loja.controller;

import com.desafio.loja.repositories.entities.Cliente;
import com.desafio.loja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;


    @GetMapping("/buscarTodos")
    public List<Cliente> buscarTodos() {
        return clienteService.buscarClientes();
    }

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }


    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.delete(id);
    }

}
