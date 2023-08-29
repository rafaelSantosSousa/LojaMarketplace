package com.desafio.loja.repositories;

import com.desafio.loja.repositories.entities.Cliente;
import com.desafio.loja.repositories.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Long> {


}
