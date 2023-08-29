package com.desafio.loja.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto",nullable = false)
    private Long id;
    @Column(name = "nome_produto",nullable = false)
    private String nome;
    @Column(name = "valor_produto",nullable = false)
    private Double valor;

}