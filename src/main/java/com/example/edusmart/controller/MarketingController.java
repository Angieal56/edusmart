package com.example.edusmart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    // Endpoint GET que recibe las dos variables por URL
    @GetMapping("/publicidad")
    public String obtenerPublicidad(
            @RequestParam("tema") String tema,
            @RequestParam("audiencia") String audiencia) {

        // texto generado simulando la estructura del prompt
        return "Inscríbete ya! Domina el curso de " + tema + " diseñado especialmente para " + audiencia + ".";
    }
}