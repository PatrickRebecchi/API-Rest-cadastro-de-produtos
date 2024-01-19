package com.pessoal.projeto.api.fornecedor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
    String logradouro,
    String bairro,
    String cep,
    String cidade,
    String uf,
    String complemento,
    String numero) {
}