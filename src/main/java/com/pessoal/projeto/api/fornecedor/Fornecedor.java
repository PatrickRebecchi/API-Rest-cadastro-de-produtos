package com.pessoal.projeto.api.fornecedor;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {
    private String nome;
    private String cnpj;
    private String telefone;
    private String nomeVendedor;

    @Embedded
    private Endereco endereco;

    public Fornecedor(DadosFornecedor dadosFornecedor){
        this.nome = dadosFornecedor.nome();
        this.cnpj = dadosFornecedor.cnpj();
        this.telefone = dadosFornecedor.telefone();

    }


}
