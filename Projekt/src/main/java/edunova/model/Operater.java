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
    
    private String loinka;

    public Operater() {
        super();
    }
    
    

    public Operater(String loinka, String ime, String prezime, String iban, String telefon, String oib, Integer sifra) {
        super(ime, prezime, iban, telefon, oib, sifra);
        this.loinka = loinka;
    }
    
    

    public String getLoinka() {
        return loinka;
    }

    public void setLoinka(String loinka) {
        this.loinka = loinka;
    }

   
    
    
}
