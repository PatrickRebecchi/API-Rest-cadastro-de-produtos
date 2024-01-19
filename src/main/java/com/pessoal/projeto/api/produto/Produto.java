package com.pessoal.projeto.api.produto;

import com.pessoal.projeto.api.fornecedor.Fornecedor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "/produtos")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String quantidade;
    private String preco;
    private String valorAdquirido;

    @Embedded
    private Fornecedor fornecedor;


    public Produto(CadastroDeProduto dados){
        this.nome = dados.nome();
        this.quantidade = dados.quantidade();
        this.preco = dados.preco();
        this.valorAdquirido = dados.valorAdquirido();

    }

}
