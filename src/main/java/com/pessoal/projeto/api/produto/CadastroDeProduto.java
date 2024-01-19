package com.pessoal.projeto.api.produto;

public record CadastroDeProduto(
        String nome,
        String quantidade,
        String preco,
        String valorAdquirido
        ) {
}
