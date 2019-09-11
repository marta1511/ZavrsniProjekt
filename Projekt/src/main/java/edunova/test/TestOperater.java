/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.test;

import edunova.controller.ObradaOperater;
import edunova.model.Operater;
import edunova.utility.EdunovaException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marta
 */
public class TestOperater {
    
   public static void test() {
        Operater o = new Operater();
        o.setIme("Tomislav");
        o.setPrezime("Jakopec");
        o.setEmail("tjakopec@gmail.com");
        o.setLozinka(BCrypt.hashpw("t", BCrypt.gensalt()));
         
       ObradaOperater obrada = new ObradaOperater();
        try {
            o = obrada.spremi(o);
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }

        System.out.println(o.getSifra());
    }
}
