package com.desafio.loja.repositories;

import com.desafio.loja.repositories.entities.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaRepository extends JpaRepository<Loja,Long> {

}
