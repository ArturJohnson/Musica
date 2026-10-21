package com.senai.music.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {

    @GetMapping("Artista")
    public String mostrarArtista(){
        return "Marilia Mendonça!!" ;
    }
}
