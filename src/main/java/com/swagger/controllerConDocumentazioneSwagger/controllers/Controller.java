package com.swagger.controllerConDocumentazioneSwagger.controllers;

import com.swagger.controllerConDocumentazioneSwagger.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/ritornanome")
    public String ritornaNome(@RequestParam String nome){
        return nome;
    }
    @PostMapping("/ritornanomealcontrario")
    public String nomeAlContrario(@RequestParam String nome){
        return service.reverseString(nome);
    }
}
