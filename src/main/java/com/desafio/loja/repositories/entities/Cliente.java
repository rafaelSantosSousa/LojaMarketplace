package com.desafio.loja.repositories.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "idade", nullable = false)
    private Integer idade;
    @Column (name= "email", nullable = false)
    @Email(message = "Email inválido")
    private String email;
    @Column(name = "ativo")
    private Boolean ativo;
    @Column (name= "telefone", nullable = false)
    private Long telefone;
    @Column(name = "senha", nullable = false)
    @NotEmpty(message = "A senha deve ser informada")
    private String senha;
    @Column (name = "cpf")
    private Long cpf;
    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco;
}
