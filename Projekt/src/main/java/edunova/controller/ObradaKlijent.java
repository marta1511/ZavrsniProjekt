/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Klijent;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Marta
 */
public class ObradaKlijent extends ObradaOsoba<Klijent> {

   
    
    @Override
    public List<Klijent> getEntiteti() {
         return session.createQuery("from Klijent").list();
    }
        public List<Klijent> getKlijent(String uvjet) {
        return session.createQuery("from Klijent a "
                + " where a.ime like :uvjet or "
                + " a.prezime like :uvjet")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaSpremi(Klijent entitet) throws EdunovaException {
       super.kontrolaSpremi(entitet);
        kontrolaBrojVozacke(entitet);
    }

    @Override
    protected void kontrolaBrisi(Klijent entitet) throws EdunovaException {
      super.kontrolaBrisi(entitet);
    }

   
    
   
      private void kontrolaBrojVozacke(Klijent entitet) throws EdunovaException {
        if (entitet.getBrojVozacke()== null){
            throw new EdunovaException("Broj vozačke mora biti unesen");
                
                 
        }else if(entitet.getBrojVozacke().trim().length()<8 ) {
            throw new EdunovaException("Broj vozačke mora biti 8 znakova");
            
        }
      }

   
    
    
}
