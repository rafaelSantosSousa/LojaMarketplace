package com.desafio.loja.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_loja")
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loja",nullable = false)
    private Long id;

    @Column(name = "nome_loja",nullable = false)
    private String nome;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @ManyToOne
    @JoinColumn (name = "id_seller")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;


}