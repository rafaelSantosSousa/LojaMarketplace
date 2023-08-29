package com.desafio.loja.services;

import com.desafio.loja.repositories.*;
import com.desafio.loja.repositories.entities.*;
import com.desafio.loja.repositories.entities.enuns.StatusPedido;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private LojaRepository lojaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @Transactional
    public Pedido pedidoRealizado(Pedido pedido) {
        pedido.setStatusPedido(StatusPedido.PEDIDO_REALIZADO);
        pedido.setData(LocalDate.now());

        Cliente cliente = clienteRepository.save(pedido.getCliente());
        pedido.setCliente(cliente);

        Loja loja = lojaRepository.save(pedido.getLoja());
        pedido.setLoja(loja);

        Seller seller = sellerRepository.save(pedido.getSeller());
        pedido.setSeller(seller);

        return pedidoRepository.save(pedido);
    }
}
