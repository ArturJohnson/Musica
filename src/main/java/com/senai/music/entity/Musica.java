package com.senai.music.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {

    @Id
    private String id;
    private String nome;
    private Genero genero;
    private int idArtista;
}
