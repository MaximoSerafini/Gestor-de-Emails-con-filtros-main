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
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario));  // Criterio de filtro por destinatario
        return emails.stream()
                     .filter(para)
                     .collect(Collectors.toList()); 
    }

    // Filtra los emails cuyo remitente coincide con el contacto especificado
    public static List<Email> filtroRemitente(List<Email> emails, Contacto remitente) {
        Predicate<Email> remitenteEmail = email -> email.getRemitente().equals(remitente);  // Criterio de filtro por remitente
        return emails.stream()
                     .filter(remitenteEmail)  // Aplica el filtro
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }

    // Filtra los emails cuyo contenido contiene la palabra clave dada
    public static List<Email> filtroContenido(List<Email> emails, String filtro) {
        Predicate<Email> porContenido = email -> email.getContenido().contains(filtro);  // Criterio de filtro por contenido
        return emails.stream()
                     .filter(porContenido)  // Aplica el filtro
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }

    // Filtra los emails por asunto, destinatario y contenido simultáneamente
    public static List<Email> filtroDelAsuntoYParaQuienYContenido(List<Email> emails, String asunto, Contacto destinatario, String contenido) {
        Predicate<Email> porAsunto = email -> email.getAsunto().contains(asunto);  // Filtro por asunto
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario));  // Filtro por destinatario
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido);  // Filtro por contenido
        return emails.stream()
                     .filter(porAsunto.and(para).and(porContenido))  // Aplica los tres filtros
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }

    // Filtra los emails por destinatario y contenido simultáneamente
    public static List<Email> filtroParaDestinatarioYContenido(List<Email> emails, Contacto destinatario, String contenido) {
        Predicate<Email> para = email -> email.getPara().stream().anyMatch(contacto -> contacto.equals(destinatario));  // Filtro por destinatario
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido);  // Filtro por contenido
        return emails.stream()
                     .filter(para.and(porContenido))  // Aplica ambos filtros
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }

    // Filtra los emails por asunto y contenido simultáneamente
    public static List<Email> filtroAsuntoContenido(List<Email> emails, String asunto, String contenido) {
        Predicate<Email> porAsunto = email -> email.getAsunto().contains(asunto);  // Filtro por asunto
        Predicate<Email> porContenido = email -> email.getContenido().contains(contenido);  // Filtro por contenido
        return emails.stream()
                     .filter(porAsunto.and(porContenido))  // Aplica ambos filtros
                     .collect(Collectors.toList());  // Recoge el resultado en una lista
    }
}

