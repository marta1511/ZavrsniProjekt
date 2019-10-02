/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import net.bytebuddy.implementation.ToStringMethod;


/**
 
 * @author Marta
 */
@Entity
public class Klijent extends Osoba implements Serializable{
 
    public String brojVozacke;

    public Klijent() {
        super();
    }

    public Klijent(String brojVozacke, String ime, String prezime, String oib, String email, String telefon, Integer sifra) {
        super(ime, prezime, oib, email, telefon, sifra);
        this.brojVozacke = brojVozacke;
    }

    
    
    

    public String getBrojVozacke() {
        return brojVozacke;
    }

    public void setBrojVozacke(String brojVozacke) {
        this.brojVozacke = brojVozacke;
    }
    
  

}

