package com.senai.music.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artista {

    @Id
    private int id;
    private String nome;
    private String estilo;

}
