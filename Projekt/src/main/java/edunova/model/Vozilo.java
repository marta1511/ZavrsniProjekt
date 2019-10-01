/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 
 * @author Marta
 */
@Entity
public class Vozilo extends Model implements Serializable{
    
    private String registracijaskaOznaka;
    private Date datumRegistracije;

    public Vozilo() {
        super();
    }
    
    

    public Vozilo(String registracijaskaOznaka, Date datumRegistracije, String naziv, String marka,  Integer brojSjedala, String vrstaMotora, Boolean automatik, Date godinaProizvodnje, BigDecimal cijenaPoDanu, Integer sifra) {
        super(naziv, marka, brojSjedala, vrstaMotora, automatik, godinaProizvodnje, cijenaPoDanu, sifra);
        this.registracijaskaOznaka = registracijaskaOznaka;
        this.datumRegistracije = datumRegistracije;
    }
    
    

    public String getRegistracijaskaOznaka() {
        return registracijaskaOznaka;
    }

    public void setRegistracijaskaOznaka(String registracijaskaOznaka) {
        this.registracijaskaOznaka = registracijaskaOznaka;
    }

    public Date getDatumRegistracije() {
        return datumRegistracije;
    }

    public void setDatumRegistracije(Date datumRegistracije) {
        this.datumRegistracije = datumRegistracije;
    }
    
    
}
