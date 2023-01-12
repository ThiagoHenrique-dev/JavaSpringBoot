package com.treina.recife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treina.recife.Service.ContatoService;
import com.treina.recife.model.contato;

@RestController
public class ContatoController {
    
    @PostMapping("/contatos")
    public contato criaNovoContato(@RequestBody contato contato){
        return contatoService.save(contato);

    }

    @GetMapping("/contatos")
    public List<contato> obterTodosContatos(){
        return contatoService.findAll();
    }

    @GetMapping("/contatos/{id}")
    public contato obterContatoPeloId(@PathVariable("id") long id){
        return contatoService.findById(id).get();
    }

    @Autowired
    private ContatoService contatoService;
}
