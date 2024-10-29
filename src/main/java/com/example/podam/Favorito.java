package com.example.podam;

import java.util.ArrayList;
import java.util.List;

public class Favorito {
    private List<Email> favoritos;

    public Favorito() {
        this.favoritos = new ArrayList<>();
    }

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
