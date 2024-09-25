package com.example.podam;
import java.util.ArrayList;
import java.util.List;

public class Email { 
    private String asunto;
    private String contenido;
    private String remitente;
    public List<Contacto> para;

    
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

    public List<Contacto> getPara(){
        return para;
    }

    public void setRemitente(String remitente){
        this.remitente = remitente;
    }

    public void setPara(List<Contacto> para) {
        this.para = para;
    }

    public String getRemitente(){
        return remitente; 
    }

    public Email() {
        this.para = new ArrayList<>(); // Inicializa
    }
}
