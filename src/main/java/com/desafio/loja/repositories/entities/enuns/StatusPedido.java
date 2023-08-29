package com.desafio.loja.repositories.entities.enuns;

public enum StatusPedido {

    PEDIDO_REALIZADO(0, "PEDIDO REALIZADO"),
    PAGAMENTO_CONFIRMADO(1, "PAGAMENTO CONFIRMADO"),
    PEDIDO_ENVIADO(2, "PEDIDO ENVIADO"),
    PEDIDO_ENTREGUE(3, "PEDIDO ENTREGUE"),
    PEDIDO_CANCELADO(4, "PEDIDO CANCELADO");
    private Integer cod;
    private String descricao;

    StatusPedido(Integer cod, String descrição) {
        this.cod = cod;
        this.descricao = descrição;
    }

    StatusPedido(String statuspedido) {
    }
}