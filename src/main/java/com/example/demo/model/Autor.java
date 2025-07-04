package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    public Autor() {
    }

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
}
