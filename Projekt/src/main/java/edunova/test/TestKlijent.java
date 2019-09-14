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
     
         ObradaKlijent obrada = new ObradaKlijent();
         try {
             k =obrada.spremi(k);
             
         } catch (EdunovaException e) {
             System.out.println(e.getPoruka());
         }
         System.out.println(k.getSifra());
         
         Klijent zaPromjenu =HibernateUtil.getSession().get(Klijent.class, 1);
         
         zaPromjenu.setPrezime(new String("Anić"));
         try {
             obrada.spremi(zaPromjenu);
         } catch (EdunovaException e) {
             System.out.println(e.getPoruka());
         }
          for (Klijent klijent : obrada.getEntiteti()) {
            System.out.println(klijent.getSifra() + ": "
                    + klijent.getIme());
        }
        try {
            obrada.brisi(k);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

     }
}
