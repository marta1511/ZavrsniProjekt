/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;


/**
 
 * @author Marta
 */
@Entity
public class Klijent extends Entitet implements Serializable{
    public String ime;
    public String prezime;
    public String email;
    public String telefon;
    public String brojVozacke;

    public Klijent() {
        super();
    }

    public Klijent(Integer sifra, String ime, String prezime, String email, String telefon, String brojVozacke ) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.telefon = telefon;
        this.brojVozacke = brojVozacke;
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

    public String getBrojVozacke() {
        return brojVozacke;
    }

    public void setBrojVozacke(String brojVozacke) {
        this.brojVozacke = brojVozacke;
    }
    
    
}

