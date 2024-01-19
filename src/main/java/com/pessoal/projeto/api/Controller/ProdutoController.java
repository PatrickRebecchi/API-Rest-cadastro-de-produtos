package com.pessoal.projeto.api.Controller;

import com.pessoal.projeto.api.produto.CadastroDeProduto;
import com.pessoal.projeto.api.produto.Produto;
import com.pessoal.projeto.api.produto.ProdutoRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroDeProduto dados){
        repository.save(new Produto());
    }


}
