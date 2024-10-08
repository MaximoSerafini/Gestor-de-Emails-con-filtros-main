package com.example.podam;

public class Contacto {
    private String name;  // Nombre del contacto
    private String mail;  // Correo electrónico

    public Contacto() {
    }  // Constructor por defecto

    public Contacto(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }  // Constructor con parámetros

    public String getName() {
        return name;
    }  // Getter para name

    public String getMail() {
        return mail;
    }  // Getter para mail
}

