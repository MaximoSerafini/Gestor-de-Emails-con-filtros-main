package com.example.podam;

import java.util.ArrayList;
import java.util.List;

public class EmailManager {

    public List<Email> listaMail;
    public List<Email> bandejaEntrada;
    public List<Email> bandejaSalida;
    private Contacto propietario;  

    public EmailManager(Contacto propietario){
        this.propietario = propietario;
        listaMail = new ArrayList<>();
        this.bandejaEntrada = new ArrayList<>();
        this.bandejaSalida = new ArrayList<>();
    }

    public List<Email> getBandejaEntrada(){
        return bandejaEntrada;
    }

    public void setBandejaEntrada(List<Email> bandejaentrada) {
        this.bandejaEntrada = bandejaentrada;
    }

    public Contacto getPropietario(){
        return propietario;
    }
}