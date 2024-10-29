package com.example.podam;

import java.util.ArrayList;
import java.util.List;

public class Favorito {
    private Contacto propietario;  // Contacto dueño de esta lista de favoritos
    private List<Email> favoritos; // Lista de correos favoritos

    public Favorito(Contacto propietario) {
        this.propietario = propietario;
        this.favoritos = new ArrayList<>();
    }

    public Contacto getPropietario() {
        return propietario;
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
