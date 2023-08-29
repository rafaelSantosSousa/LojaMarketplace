package com.desafio.loja.repositories.entities;

import com.desafio.loja.repositories.entities.enuns.StatusPedido;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Long id;

    @Column(name = "data_do_pedido", nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn (name = "id_cliente",nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_seller", nullable = false)
    private Seller seller;

    @OneToMany(targetEntity=ItemPedido.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    private List<ItemPedido> itemPedido;

    @Column(name = "valor_total")
    private Double valorTotal;

    @ManyToOne
    @JoinColumn (name = "id_loja")
    private Loja loja;

    @Column(name = "status_pedido")
    private StatusPedido statusPedido;
}
