/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    private String naziv;
    private String marka;
    
    private Integer brojSjedala;
    private String vrstaMotora;
    private Boolean automatik;
    private Date godinaProizvodnje;
    private BigDecimal cijenaPoDanu;

    public Vozilo() {
        super();
    }
    
    

    public Vozilo(String registracijaskaOznaka, Date datumRegistracije, String naziv, String marka, Integer brojSjedala, String vrstaMotora, Boolean automatik, Date godinaProizvodnje, BigDecimal cijenaPoDanu, Integer sifra) {
        super(sifra);
        this.registracijaskaOznaka = registracijaskaOznaka;
        this.datumRegistracije = datumRegistracije;
        this.naziv = naziv;
        this.marka = marka;
        this.brojSjedala = brojSjedala;
        this.vrstaMotora = vrstaMotora;
        this.automatik = automatik;
        this.godinaProizvodnje = godinaProizvodnje;
        this.cijenaPoDanu = cijenaPoDanu;
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

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Integer getBrojSjedala() {
        return brojSjedala;
    }

    public void setBrojSjedala(Integer brojSjedala) {
        this.brojSjedala = brojSjedala;
    }

    public String getVrstaMotora() {
        return vrstaMotora;
    }

    public void setVrstaMotora(String vrstaMotora) {
        this.vrstaMotora = vrstaMotora;
    }

    public Boolean getAutomatik() {
        return automatik;
    }

    public void setAutomatik(Boolean automatik) {
        this.automatik = automatik;
    }

    public Date getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(Date godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public BigDecimal getCijenaPoDanu() {
        return cijenaPoDanu;
    }

    public void setCijenaPoDanu(BigDecimal cijenaPoDanu) {
        this.cijenaPoDanu = cijenaPoDanu;
    }
    
    
     @Override
    public String toString() {
        return marka + " " + naziv + ", " + registracijaskaOznaka ;
}

    public void setDatumRegistracije(LocalDateTime d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}