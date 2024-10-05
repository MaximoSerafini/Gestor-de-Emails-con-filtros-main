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
                     .collect(Collectors.toList()); //filtro remitente
    }
}
