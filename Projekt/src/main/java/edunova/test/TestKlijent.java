/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaKlijent;
import edunova.model.Klijent;
import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;


/**
 *
 * @author Marta
 */
public class TestKlijent {
    
     public static void test() {
     Klijent k = new Klijent();
     k.setIme("Luka");
     k.setPrezime("Anić");
     k.setBrojVozacke("01234567");
     k.setTelefon("0998745632");
     k.setOib("93428302730");
     k.setEmail("luka@gmail.com");
     
         ObradaKlijent obrada = new ObradaKlijent();
         try {
             k =obrada.spremi(k);
             
         } catch (EdunovaException e) {
             System.out.println(e.getPoruka());
         }
         System.out.println(k.getSifra());
         
     }
}
