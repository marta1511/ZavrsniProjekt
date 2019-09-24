/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Marta
 */
@Entity
public class Operater extends Osoba implements Serializable {
    
    private String lozinka;

    public Operater() {
        super();
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public Operater(String lozinka, String ime, String prezime, String oib, String email, String telefon, Integer sifra) {
        super(ime, prezime, oib, email, telefon, sifra);
        this.lozinka = lozinka;
    }
    

}

   

  
   
   
