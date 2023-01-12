package com.treina.recife.model;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Data
@Entity
public class contato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private Calendar dataNascimento;

   
}
