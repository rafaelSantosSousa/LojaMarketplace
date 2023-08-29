package com.desafio.loja.controller;

import com.desafio.loja.repositories.entities.Pedido;
import com.desafio.loja.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/cadastrar")
    public Pedido SalvarPedido(@RequestBody Pedido pedido){
        return pedidoService.pedidoRealizado(pedido);
    }

















}
