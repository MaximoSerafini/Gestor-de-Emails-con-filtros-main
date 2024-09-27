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
    
}
