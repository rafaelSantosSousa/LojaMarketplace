package com.desafio.loja.repositories;

import com.desafio.loja.repositories.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
