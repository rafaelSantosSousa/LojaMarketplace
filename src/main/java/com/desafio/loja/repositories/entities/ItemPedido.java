package com.desafio.loja.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_pedido", nullable = false)
    private Long id;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto",nullable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_pedido",nullable = false)
    private Pedido pedido;

}
