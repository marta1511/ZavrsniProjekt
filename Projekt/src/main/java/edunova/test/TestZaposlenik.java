/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;


import edunova.controller.ObradaZaposlenik;
import edunova.model.Zaposlenik;
import edunova.utility.EdunovaException;

/**
 *
 * @author Marta
 */
public class TestZaposlenik {
    public static void test() {
     Zaposlenik z = new Zaposlenik();
     z.setIme("Luka");
     z.setPrezime("Babić");
     z.setIban("HR4524020067199524876");
     z.setTelefon("0958745632");
     z.setOib("93428302730");
     z.setEmail("lukababic@gmail.com");
     
        ObradaZaposlenik obrada = new ObradaZaposlenik();
         try {
             z =obrada.spremi(z);
             
         } catch (EdunovaException e) {
             System.out.println(e.getPoruka());
         }
         System.out.println(z.getSifra());
         
     }
}
