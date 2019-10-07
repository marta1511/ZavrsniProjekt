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
import javax.persistence.ManyToOne;

/**
 
 * @author Marta
 */
@Entity
public class Vozilo extends Entitet implements Serializable{
    
    private String registracijaskaOznaka;
    private Date datumRegistracije;
    
    @ManyToOne
    private Model model;

    public Vozilo() {
        super();
    }

    public Vozilo(String registracijaskaOznaka, Date datumRegistracije, Model model, Integer sifra) {
        super(sifra);
        this.registracijaskaOznaka = registracijaskaOznaka;
        this.datumRegistracije = datumRegistracije;
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
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
