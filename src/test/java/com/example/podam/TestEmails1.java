package com.example.podam;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
//////////
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
    public void test_asunto(){
        Email email1 = new Email();

        email1.setAsunto("Prueba");

        assertEquals("Prueba", email1.getAsunto());
    }

    @Test
    public void test_contenido_tambien_test_sin_asunto(){
        Email email1 = new Email();

        email1.setContenido("Prueba Contenido");

        assertEquals("Prueba Contenido", email1.getContenido());
    }

    @Test
    public void test_remitente(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");
    
        Email email1 = new Email();
        email1.setRemitente(contacto1); // contacto!

        assertEquals(contacto1, email1.getRemitente());
    }



    @Test
    public void test_Contacto_prueba_y_Email(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");
    
        Email email1 = new Email();

        email1.setAsunto("Prueba");
        email1.setContenido("Prueba Contenido");
        email1.setRemitente(contacto1); // contacto!

        assertEquals("Prueba", email1.getAsunto());
        assertEquals("Prueba Contenido", email1.getContenido());
        assertEquals(contacto1, email1.getRemitente());
    }

    @Test
    public void prueba_para_1_contacto(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");

        Email email1 = new Email(); 

        email1.para.add(contacto1);

        assertTrue(email1.para.contains(contacto1));
        assertEquals(1, email1.para.size());
    }

    @Test
    public void prueba_para_3_contactos(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");
        Contacto contacto2 = new Contacto("Gabriel Fagundez","ositofagundez@gmail.com");
        Contacto contacto3 = new Contacto("Santiago Serrano","serranoelcrack@gmail.com");

        Email email1 = new Email(); 

        email1.para.add(contacto1);
        email1.para.add(contacto2);
        email1.para.add(contacto3);
    
        assertTrue(email1.para.contains(contacto1));
        assertTrue(email1.para.contains(contacto2));
        assertTrue(email1.para.contains(contacto3));
        assertEquals(3, email1.para.size());
    }

    @Test
    public void prueba_para_completo(){
        Contacto contacto1 = new Contacto("Maximo Serafini","maximoserafini44@gmail.com");

        Email email1 = new Email(); 

        email1.setAsunto("Prueba");
        email1.setContenido("Prueba Contenido");

        email1.para.add(contacto1);

        
        assertEquals("Prueba", email1.getAsunto());
        assertEquals("Prueba Contenido", email1.getContenido());

        assertTrue(email1.para.contains(contacto1));
        assertEquals(1, email1.para.size());
    }

    @Test
    public void debe_crear_un_email_simple(){
        Email email1 = new Email();
        email1.setAsunto("Test 1");

        Contacto destinatario = new Contacto("Alfredo", "alfredo@gmail.com");
        email1.para.add(destinatario);

        assertEquals("Test 1", email1.getAsunto());
        assertTrue(email1.getPara().contains(destinatario));  
    }
    
    @Test
    public void testFiltroAsunto() {
        Contacto contacto1 = new Contacto("Lucas", "lucas@gmail.com");
        Contacto contacto2 = new Contacto("Maxi","maxi@gmail.com");
        Contacto contacto3 = new Contacto("Santi", "santi@gmail.com");

        Email email1 = new Email();
        Email email2 = new Email();
        Email email3 = new Email();

        email1.setAsunto("Test 1");
        email1.setAsunto("Prueba");
        email1.setContenido("Prueba Contenido");
        email1.setRemitente(contacto1);

        email2.setAsunto("Test 1");
        email2.setAsunto("Prueba");
        email2.setContenido("Prueba Contenido");
        email2.setRemitente(contacto2);

        email3.setAsunto("Test 1");
        email3.setAsunto("aaaaa");
        email3.setContenido("Prueba aaaa");
        email3.setRemitente(contacto3);

        List<Email> correos = Arrays.asList(email1, email2, email3);
        List<Email> resultado = Filtros.filtroAsunto(correos, "Prueba");

        assertEquals(2, resultado.size()); // cantidad de coinc
        assertTrue(resultado.contains(email1));
        assertTrue(resultado.contains(email2));
    }

    @Test
    public void guarda_email_bandeja_de_entrada(){
        Contacto alfredo = new Contacto("Alfredo", "alfredo@gmail.com");  
        EmailManager bandejaentrada = new EmailManager(alfredo);  

        Email email1 = new Email();
        email1.setAsunto("Test 1");

        email1.para.add(alfredo);  

        bandejaentrada.getBandejaEntrada().add(email1); 

        assertEquals(1, bandejaentrada.getBandejaEntrada().size());
        assertEquals("Test 1", email1.getAsunto());
        assertTrue(email1.getPara().contains(alfredo));  

        // Deberia ser Alfredo :)
        assertEquals(alfredo, bandejaentrada.getPropietario());
    }
}
