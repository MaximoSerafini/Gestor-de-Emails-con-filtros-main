package com.example.podam;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestEmails2 {

    @Test
    public void TestFavorito() {
        Contacto propietario = new Contacto("Propietario", "propietario@example.com");
        Favorito favorito = new Favorito(propietario);
        Email email1 = new Email();
        email1.setAsunto("Asunto1");
        email1.setContenido("Contenido del correo 1");

        Email email2 = new Email();
        email2.setAsunto("Asunto2");
        email2.setContenido("Contenido del correo 2");

        assertTrue(favorito.getFavoritos().isEmpty());
        favorito.agregarFavorito(email1);
        assertTrue(favorito.getFavoritos().contains(email1));
        assertEquals(1, favorito.getFavoritos().size());

        favorito.agregarFavorito(email1); // Intento de duplicado
        assertEquals(1, favorito.getFavoritos().size());

        // Test eliminar Favorito
        favorito.agregarFavorito(email2);
        assertTrue(favorito.eliminarFavorito(email1));
        assertFalse(favorito.getFavoritos().contains(email1));
        assertEquals(1, favorito.getFavoritos().size());

        assertFalse(favorito.eliminarFavorito(email1)); // Eliminación de no existente

        assertTrue(favorito.esFavorito(email2));
        assertFalse(favorito.esFavorito(email1));
    }

    @Test
    public void testAgregarEmailAGrupo() {
        GrupoDeUsuarios grupoAmigos = new GrupoDeUsuarios(new Contacto("Propietario", "propietario@example.com"));
        Contacto contacto1 = new Contacto("Maximo Serafini", "maximoserafini44@gmail.com");
        Contacto contacto2 = new Contacto("Gabriel Fagundez", "ositofagundez@gmail.com");

        grupoAmigos.agregarAlGrupo(contacto1);
        grupoAmigos.agregarAlGrupo(contacto2);

        String asunto = "Reunión";
        String contenido = "Contenido del correo";

        // Captura el email enviado al grupo
        Email emailEnviado = grupoAmigos.enviarCorreoAGrupo(asunto, contenido);

        // Verifica que el email fue enviado con el asunto y contenido correctos
        assertEquals(asunto, emailEnviado.getAsunto());
        assertEquals(contenido, emailEnviado.getContenido());

        // Verifica que los destinatarios del email incluyen a los contactos del grupo
        assertTrue(emailEnviado.getPara().contains(contacto1));
        assertTrue(emailEnviado.getPara().contains(contacto2));
        assertEquals(2, emailEnviado.getPara().size());  // Verifica que hay exactamente 2 destinatarios
    }

    @Test
    public void testEliminarContactoDelGrupo() {
        GrupoDeUsuarios grupoAmigos = new GrupoDeUsuarios(new Contacto("Propietario", "propietario@example.com"));
        Contacto contacto1 = new Contacto("Maximo Serafini", "maximoserafini44@gmail.com");
        Contacto contacto2 = new Contacto("Gabriel Fagundez", "ositofagundez@gmail.com");

        grupoAmigos.agregarAlGrupo(contacto1);
        grupoAmigos.agregarAlGrupo(contacto2);

        // Verifica que los contactos fueron agregados
        assertTrue(grupoAmigos.contieneContacto(contacto1));
        assertTrue(grupoAmigos.contieneContacto(contacto2));

        // Elimina un contacto del grupo
        boolean eliminado = grupoAmigos.eliminarDelGrupo(contacto1);

        // Verifica que el contacto fue eliminado
        assertTrue(eliminado);
        assertFalse(grupoAmigos.contieneContacto(contacto1));

        // Verifica que el otro contacto sigue en el grupo
        assertTrue(grupoAmigos.contieneContacto(contacto2));
    }
}
