package com.desafio.loja.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id", nullable = false)
    private Long id;
    @Column(name = "nome_seller", nullable = false)
    private String nome;
    @Column(name = "nome_fantasia", nullable = false)
    private String nomeFantasia;
    @Column(name = "cnpj", nullable = false)
    private Long cnpj;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "ativo", nullable = false)
    private Boolean ativo;
    @Column(name = "telefone", nullable = false)
    private Long telefone;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "ramo_de_atuacao", nullable = false)
    private String ramoDeAtuacao;
    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco;

}


