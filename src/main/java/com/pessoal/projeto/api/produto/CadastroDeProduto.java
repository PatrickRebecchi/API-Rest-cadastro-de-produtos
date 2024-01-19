package com.pessoal.projeto.api.produto;

import jakarta.validation.constraints.NotBlank;

public record CadastroDeProduto(
        @NotBlank
        String nome,
        @NotBlank
        String quantidade,
        @NotBlank
        String preco,
        @NotBlank
        String valorAdquirido
        ) {
}
