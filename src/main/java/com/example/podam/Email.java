package com.example.podam;
import java.util.ArrayList;
import java.util.List;

public class Email { 
    private String asunto;         // Asunto del email
    private String contenido;      // Contenido del email
    private Contacto remitente;    // Remitente del email
    public List<Contacto> para;    // Lista de destinatarios

    public Email() {
        this.para = new ArrayList<>();
    }  // Constructor por defecto

    public Email(String asunto, Contacto remitente, List<Contacto> para) {
        this.para = para;
        this.asunto = asunto;
        this.remitente = remitente;
    }  // Constructor con parámetros

    public void setAsunto(String asunto){
        this.asunto = asunto;
    }  // Setter para asunto

    public String getAsunto(){
        return asunto; 
    }  // Getter para asunto

    public void setContenido(String contenido){
        this.contenido = contenido;
    }  // Setter para contenido

    public String getContenido(){
        return contenido; 
    }  // Getter para contenido

    public List<Contacto> getPara(){
        return para;
    }  // Getter para destinatarios

    public void setPara(List<Contacto> para) {
        this.para = para;
    }  // Setter para destinatarios

    public Contacto getRemitente(){
        return remitente; 
    }  // Getter para remitente

    public void setRemitente(Contacto remitente){
        this.remitente = remitente;
    }  // Setter para remitente

    public Email clonar() {

        Email emailClon= new Email();
        emailClon.setAsunto(this.asunto);
        emailClon.setContenido(this.contenido);
        emailClon.setRemitente(this.remitente);

        List<Contacto> copiaPara = new ArrayList<>(this.para);
        emailClon.setPara(copiaPara);

        return emailClon;
    }
}
