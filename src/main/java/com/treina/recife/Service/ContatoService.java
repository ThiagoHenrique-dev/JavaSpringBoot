package com.treina.recife.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treina.recife.model.contato;

public interface ContatoService  extends JpaRepository <contato, Long> {

   
    
}
