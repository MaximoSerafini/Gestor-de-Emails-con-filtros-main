package com.example.podam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class TestEmails1{
      // Test Esperado
    //public static void main( String[] args ){
    //    persona1 = new Contacto(“Nombre 1 Apellido 1”, “persona1@demo.com”)
    //    persona2 = new Contacto(“Nombre 2 Apellido 2”, “persona2@demo.com”)
//
    //    persona3 = new Contacto(“Nombre 3 Apellido 3”, “persona3@demo.com”)
    //    Email = new Email()
    //    email.Asunto = “Prueba UCP”
    //    email.Contendo = “Estamos en la materia Paradigmas 2”
    //    email.Remitente = persona1
    
    //    email.Para.Agregar(persona2)
    //    emailManager.Enviar(email)
    //    emailEnviado = emailManager.BandejaEnviados[0]
    //    emailManager.BandejaEntrada.Agregar(email1)
    //    emailManager.BandejaEntrada.Agregar(email2)
    //    emailManager.BandejaEntrada.Agregar(email…N)

    //    predicado1 = {Predicado para filtros de la UCP}
    //    filtro1 = new Filtro(“Correos de la UCP”, predicado1)
    //    filtro2 = new Filtro(“Del remitente Director/a”, predicado2 )
    //    filtro1.Add(filtro2); //Aqui deberia unir predicados para hacer que filtro1 se
    //    complejo
    //    Var filtro3 = new Filtro(“Complejo 1”, filtro1.Predicado);
    //    correosEncontradosDeLaUCP = emailManager.BandejaEntrada.Buscar(filtro1 )
    //    Foreach (e in correosEncontrados ){
    //        …verificar que se encuentra los emails
    //    }
    
    //}

    @Test
    public void test_Contacto_prueba_y_Email(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");
    
        Email email1 = new Email();
        email1.setAsunto("Prueba");
        email1.setContenido("Prueba Contenido");
        email1.setRemitente(contacto1.getMail());

        assertEquals("Prueba", email1.getAsunto());
        assertEquals("Prueba Contenido", email1.getContenido());
        assertEquals(contacto1.getMail(), email1.getRemitente());

        
    }
}