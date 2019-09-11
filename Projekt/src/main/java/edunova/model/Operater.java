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
public class Operater extends Zaposlenik implements Serializable {
    
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

    public Operater(String lozinka, String ime, String prezime, String iban, String telefon, String oib, String email, Integer sifra) {
        super(ime, prezime, iban, telefon, oib, email, sifra);
        this.lozinka = lozinka;
    }

   

  
   
    
    

 
    

    
    

 

   
    
    
}
