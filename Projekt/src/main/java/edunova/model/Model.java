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
 */@Entity
public class Model extends Entitet implements Serializable {
    
    private String naziv;
    private String marka;
    private String tip;
    private Integer brojSjedala;
    private String vrstaMotora;
    private Boolean automatik;
    private Date godinaProizvodnje;
    private BigDecimal cijenaPoDanu;

    public Model() {
        super();
    }
    
    

    public Model(String naziv, String marka, String tip, Integer brojSjedala, String vrstaMotora, Boolean automatik, Date godinaProizvodnje, BigDecimal cijenaPoDanu, Integer sifra) {
        super(sifra);
        this.naziv = naziv;
        this.marka = marka;
        this.tip = tip;
        this.brojSjedala = brojSjedala;
        this.vrstaMotora = vrstaMotora;
        this.automatik = automatik;
        this.godinaProizvodnje = godinaProizvodnje;
        this.cijenaPoDanu = cijenaPoDanu;
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

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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

    public void isVrstaMotora(String vrstaMotora) {
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
    
    
}
