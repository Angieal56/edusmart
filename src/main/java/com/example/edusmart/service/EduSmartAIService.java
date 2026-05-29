package com.example.edusmart.service;

@AiService
public interface EduSmartAIService {

    @UserMessage("Haz una frase de marketing de máximo 100 caracteres para vender un curso de {{tema}} dirigido a {{audiencia}}.")
    String generarAnuncio(@V("tema") String tema, @V("audiencia") String audiencia);
}