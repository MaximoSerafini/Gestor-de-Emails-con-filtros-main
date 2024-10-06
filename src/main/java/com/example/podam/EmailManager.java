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

    public List<Email> getBandejaSalida(){
        return bandejaSalida;
    }

    public void setBandejaSalida(List<Email> bandejasalida) {
        this.bandejaSalida = bandejasalida;
    }

    public Contacto getPropietario(){
        return propietario;
    }

    //enviar email: agregamos mail a la salida y copiamos para destinatarios multiples
    public void enviarEmail(Email email, List<Contacto> destinatarios, List<EmailManager> managers) { 
        //correo enviado / dest / cada bandeja (email manager)
        bandejaSalida.add(email);                                  ///////////----------------> Esto agregar a bandeja de salida 
        for (Contacto destinatario : destinatarios) {              //                             y llamar directamente en enviarEMail
            for (EmailManager manager : managers) {
                if (manager.getPropietario().equals(destinatario)) {
                    manager.getBandejaEntrada().add(email);
                }
            }
        }
    }
    
    // FALTAN AGREGAR QUIZÁS :p

    // --------> Agregar a bandeja de salida

    // --------> Agregar a bandeja de entrada

    // --------> Crear bandeja ??

    // --------> Comprobar que se cree bandeja ?? Comprobar que exista para test ??

    //---------> Filtros aplicados sobre EmailManager para recibidos y enviados !

    public void AgregarBandejaSalida() { 
        
    }

    public void AgregarBandejaEntrada() { 
        
    }

    public void CrearBandeja() { 
        
    }
}