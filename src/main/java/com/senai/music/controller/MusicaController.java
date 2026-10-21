package com.senai.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicaController {

    @GetMapping("Musica")
    public String tocar(){
        return "Tocando Jesus Chorou!!" ;
    }
}
