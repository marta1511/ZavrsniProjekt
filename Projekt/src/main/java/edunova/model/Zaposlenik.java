/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;

/**
 
 * @author Marta
 */
public class Zaposlenik extends Entitet implements Serializable {
    
    public String ime;
    public String prezime;
    public String iban;
    public String telefon;
    public String oib;

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    

    public Zaposlenik() {
        super();
    }

    public Zaposlenik(String ime, String prezime, String iban, String telefon, String oib, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.iban = iban;
        this.telefon = telefon;
        this.oib = oib;
    }

    
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    
    
}
