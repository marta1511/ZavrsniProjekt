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
 *
 * @author Marta
 */
@Entity
public class Iznajmljivanje extends Entitet implements Serializable {
     private Date datumPreuzimanja;
     private Date datumPovratka;
     private String brojUgovora;
     private BigDecimal ukupanIznosNajma;
     
     @ManyToOne
     private Klijent klijent;
     
     @ManyToOne
     private Vozilo vozilo;
     
     @ManyToOne
     private Zaposlenik zaposlenik;

    public Iznajmljivanje() {
        super();
       
    }

    public Iznajmljivanje(Date datumPreuzimanja, Date datumPovratka, String brojUgovora, BigDecimal ukupanIznosNajma, Klijent klijent, Vozilo vozilo, Zaposlenik zaposlenik, Integer sifra) {
        super(sifra);
        this.datumPreuzimanja = datumPreuzimanja;
        this.datumPovratka = datumPovratka;
        this.brojUgovora = brojUgovora;
        this.ukupanIznosNajma = ukupanIznosNajma;
        this.klijent = klijent;
        this.vozilo = vozilo;
        this.zaposlenik = zaposlenik;
    }

    public Date getDatumPreuzimanja() {
        return datumPreuzimanja;
    }

    public void setDatumPreuzimanja(Date datumPreuzimanja) {
        this.datumPreuzimanja = datumPreuzimanja;
    }

    public Date getDatumPovratka() {
        return datumPovratka;
    }

    public void setDatumPovratka(Date datumPovratka) {
        this.datumPovratka = datumPovratka;
    }

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public BigDecimal getUkupanIznosNajma() {
        return ukupanIznosNajma;
    }

    public void setUkupanIznosNajma(BigDecimal ukupanIznosNajma) {
        this.ukupanIznosNajma = ukupanIznosNajma;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }
     
     
}
