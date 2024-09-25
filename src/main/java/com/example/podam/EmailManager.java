package com.example.podam;
import java.util.ArrayList;
import java.util.List;

public class EmailManager {

    public List<Email> listaMail;
    public List<Email> bandejaEntrada;
    public List<Email> bandejaSalida;


    public EmailManager(){
        listaMail = new ArrayList<>();
        this.bandejaEntrada = new ArrayList<>();
        this.bandejaSalida = new ArrayList<>();
    }
}
