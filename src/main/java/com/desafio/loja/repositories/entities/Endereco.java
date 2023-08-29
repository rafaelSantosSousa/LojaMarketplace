package com.desafio.loja.repositories.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco", nullable = false)
    private Long id;
    @Column(name = "cidade", nullable = false)
    private String cidade;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "bairro", nullable = false)
    private String bairro;
    @Column(name = "rua", nullable = false)
    private String rua;
    @Column(name = "numero_do_endereco", nullable = false)
    private Integer numeroEndereco;
    @Column(name = "complemento", nullable = false)
    private String complemento;

}
