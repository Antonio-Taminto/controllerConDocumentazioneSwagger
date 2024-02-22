package com.swagger.controllerConDocumentazioneSwagger.services;
@org.springframework.stereotype.Service
public class Service {
    public String reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
