/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Marta
 */
@MappedSuperclass
public class Osoba extends Entitet{
    private String ime;
    private String prezime;
    private String oib;
    private String email;
    private String telefon;

    public Osoba() {
        super();
    }

    public Osoba(String ime, String prezime, String oib, String email, String telefon, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.email = email;
        this.telefon = telefon;
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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

        
     @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
