package com.example.podam;

import java.util.ArrayList;
import java.util.List;
// hola
public class Contacto {
    private String name;  // Nombre del contacto
    private String mail;  // Correo electrónico
    private List<Email> favoritos;  // Lista de correos favoritos del contacto
    
    public Contacto() {
        this.favoritos = new ArrayList<>();
    }  // Constructor por defecto

    public Contacto(String name, String mail) {
        this.name = name;
        this.mail = mail;
        this.favoritos = new ArrayList<>();
    }  // Constructor con parámetros

    public String getName() {
        return name;
    }  // Getter para name

    public String getMail() {
        return mail;
    }  // Getter para mail

    // Métodos para gestionar favoritos
    public List<Email> getFavoritos() {
        return favoritos;
    }

    public void agregarFavorito(Email email) {
        if (!favoritos.contains(email)) {
            favoritos.add(email);
        }
    }

    public boolean eliminarFavorito(Email email) {
        return favoritos.remove(email);
    }

    public boolean esFavorito(Email email) {
        return favoritos.contains(email);
    }
}
