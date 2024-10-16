package com.example.podam;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtros {

    public static List<Email> filtroAsunto(List<Email> emails, String filtro) {
        Predicate<Email> porAsunto = email -> email.getAsunto().contains(filtro); 
        return emails.stream()
                     .filter(porAsunto)  
                     .collect(Collectors.toList()); 
    }
    
    public static List<Email> filtroPara(List<Email> emails, Contacto destinatario) {
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario)); 
        return emails.stream()
                     .filter(para)
                     .collect(Collectors.toList()); 
    }

    public static List<Email> filtroRemitente(List<Email> emails, Contacto remitente) {
        Predicate<Email> remitenteEmail = email -> email.getRemitente().equals(remitente);  
        return emails.stream()
                     .filter(remitenteEmail) 
                     .collect(Collectors.toList());  
    }

    // Filtra los emails cuyo contenido contiene la palabra clave dada
    public static List<Email> filtroContenido(List<Email> emails, String filtro) {
        Predicate<Email> porContenido = email -> email.getContenido().contains(filtro);  // Criterio de filtro por contenido
        return emails.stream()
                     .filter(porContenido)  // Aplica el filtro
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }

    public static List<Email> filtroDelAsuntoYParaQuienYContenido(List<Email> emails, String asunto, Contacto destinatario, String contenido) {
        Predicate<Email> porAsunto = email -> email.getAsunto().contains(asunto); 
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario));  
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido);  
        return emails.stream()
                     .filter(porAsunto.and(para).and(porContenido)) 
                     .collect(Collectors.toList()); 
    }

    public static List<Email> filtroParaDestinatarioYContenido(List<Email> emails, Contacto destinatario, String contenido) {
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario));  
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido);  
        return emails.stream()
                     .filter(para.and(porContenido))  
                     .collect(Collectors.toList());
    }

    public static List<Email> filtroAsuntoContenido(List<Email> emails, String asunto, String contenido) {
        Predicate<Email> porAsunto = email -> email.getAsunto().contains(asunto);  
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido); 
        return emails.stream()
                     .filter(porAsunto.and(porContenido)) 
                     .collect(Collectors.toList());  
    }
}

