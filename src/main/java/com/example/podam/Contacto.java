package com.example.podam;

public class Contacto {
    private String name;
    private String mail;

    public Contacto() {
    }

    public Contacto(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
