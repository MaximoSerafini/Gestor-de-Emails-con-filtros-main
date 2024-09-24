package com.example.podam;

public class Email { 
    private String asunto;
    private String contenido;
    private String remitente;
    
    public void setAsunto(String asunto){
        this.asunto = asunto;
    }

    public String getAsunto(){
        return asunto; 
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public String getContenido(){
        return contenido; 
    }

    public void setRemitente(String remitente){
        this.remitente = remitente;
    }

    public String getRemitente(){
        return remitente; 
    }
}
