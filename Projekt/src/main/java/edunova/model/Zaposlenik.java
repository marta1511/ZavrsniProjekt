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
public class Zaposlenik extends Osoba implements Serializable {
    
  
    public String iban;

    public Zaposlenik() {
        super();
    }

    public Zaposlenik(String iban, String ime, String prezime, String oib, String email, String telefon, Integer sifra) {
        super(ime, prezime, oib, email, telefon, sifra);
        this.iban = iban;
    }
     public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
   

    
    
        
}
