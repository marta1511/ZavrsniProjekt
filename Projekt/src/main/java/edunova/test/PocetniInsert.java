/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaIznajmljivanje;
import edunova.controller.ObradaKlijent;
import edunova.controller.ObradaVozilo;
import edunova.controller.ObradaZaposlenik;
import edunova.model.Iznajmljivanje;
import edunova.model.Klijent;
import edunova.model.Vozilo;
import edunova.model.Zaposlenik;
import edunova.utility.EdunovaException;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Marta
 */
public class PocetniInsert {
    public static void unesi (){
    Zaposlenik z = new Zaposlenik();
     z.setIme("Luka");
     z.setPrezime("Babić");
     z.setIban("HR4524020067199524876");
     z.setTelefon("0958745632");
     z.setOib("93428302730");
     z.setEmail("lukababic@gmail.com");
     
        ObradaZaposlenik obradaZaposlenik = new ObradaZaposlenik();
         try {
            obradaZaposlenik.spremi(z);
             
         } catch (EdunovaException e) {
              JOptionPane.showMessageDialog(null, e.getPoruka());
         }
         
         
           Klijent k = new Klijent();
     k.setIme("Luka");
     k.setPrezime("Anić");
     k.setBrojVozacke("01234567");
     k.setTelefon("0998745632");
     k.setOib("93428302730");
     k.setEmail("luka@gmail.com");
     
         ObradaKlijent obradaKlijent = new ObradaKlijent();
         try {
             obradaKlijent.spremi(k);
             
         } catch (EdunovaException ex) {
             JOptionPane.showMessageDialog(null, ex.getPoruka());
    }
         
         Vozilo v = new Vozilo();
         v.setRegistracijaskaOznaka("NA-976-DG");
         v.setNaziv("Golf VI");
         v.setMarka("WW");
         v.setCijenaPoDanu(new BigDecimal(300));
         v.setAutomatik(false);
         v.setBrojSjedala(5);
         v.setDatumRegistracije(new Date());
         v.setGodinaProizvodnje("2013");
         
         ObradaVozilo obradaVozilo = new ObradaVozilo();
         try {
            obradaVozilo.spremi(v);
        } catch (EdunovaException ex) {
             JOptionPane.showMessageDialog(null, ex.getPoruka());
        }
         
         
}
    
}
