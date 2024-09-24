package com.example.podam;
import java.util.ArrayList;
import java.util.List;

public class EmailBandejas {

    public String mail;
    public List<Email> bandejaEntrada;
    public List<Email> bandejaSalida;

    public EmailBandejas(){
        this.bandejaEntrada = new ArrayList<>();
        this.bandejaSalida = new ArrayList<>();
    }
    //esto llamamos en el manager ?
}
