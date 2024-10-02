package com.example.podam;
import java.util.ArrayList;
import java.util.List;

public class Email { 
    private String asunto;
    private String contenido;
    private Contacto remitente;
    public List<Contacto> para;

    public Email() {
        this.para = new ArrayList<>();
    }

    public Email(String asunto, Contacto remitente, List<Contacto> para) {
        this.para = para;
        this.asunto = asunto;
        this.remitente = remitente;
    }

    
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

    public void setRemitente(Contacto remitente){
        this.remitente = remitente;
    }

    public void setPara(List<Contacto> para) {
        this.para = para;
    }

    public Contacto getRemitente(){
        return remitente; 
    }

}
