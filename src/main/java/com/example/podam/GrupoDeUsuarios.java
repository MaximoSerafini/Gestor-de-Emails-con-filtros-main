package com.example.podam;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeUsuarios{
    private Contacto propietario;  // Contacto dueño de este grupo
    private List<Contacto> contactos; // Lista de contactos en el grupo

    public GrupoDeUsuarios(Contacto propietario) {
        this.propietario = propietario;
        this.contactos = new ArrayList<>();
    }

    public Contacto getPropietario() {
        return propietario;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    // Metodo para agregar un contacto al grupo
    public void agregarAlGrupo(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
        }
    }

    // Metodo para eliminar un contacto del grupo
    public boolean eliminarDelGrupo(Contacto contacto) {
        return contactos.remove(contacto);
    }

    // Método para verificar si un contacto ya está en el grupo
    public boolean contieneContacto(Contacto contacto) {
        return contactos.contains(contacto);
    }

    public Email enviarCorreoAGrupo(String asunto, String contenido) {
        Email email = new Email();
        email.setAsunto(asunto);
        email.setContenido(contenido);
        email.setRemitente(propietario);
        email.setPara(new ArrayList<>(contactos)); // Asigna una copia de la lista de contactos como destinatarios
        return email; // Retorna el email para permitir su verificación en el test
    }
}
