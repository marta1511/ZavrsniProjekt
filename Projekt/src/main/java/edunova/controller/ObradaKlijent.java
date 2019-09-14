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
public class ObradaKlijent extends Obrada <Klijent> {
    
   

    @Override
    protected void KontrolaSpremi(Klijent entitet) throws EdunovaException {
        kontrolaIme(entitet);
        kontrolaPrezime(entitet);
        kontrolaTelefon(entitet);
        kontrolaBrojVozacke(entitet);
    }

    @Override
    protected void KontrolaBrisi(Klijent entitet) throws EdunovaException {
        
    }

    @Override
    public List<Klijent> getEntiteti() {
         return session.createQuery("from Klijent").list();
    }
    
    private void kontrolaIme (Klijent entitet) throws EdunovaException{
    if(entitet.getIme() == null || entitet.getIme().trim().length()==0){
    throw new EdunovaException("Obavezno unijeti ime klijenta");}
    }
     private void kontrolaPrezime (Klijent entitet) throws EdunovaException{
    if(entitet.getPrezime()== null || entitet.getPrezime().trim().length()==0){
    throw new EdunovaException("Obavezno unijeti prezime klijenta");}
    }
     
      private void kontrolaBrojVozacke(Klijent entitet) throws EdunovaException {
        if (entitet.getBrojVozacke().trim().length() <= 0 || entitet.getBrojVozacke().trim().length()> 8) {
            throw new EdunovaException("Broj vozačke mora biti 8 znakova");
                 
        }else if(entitet.getBrojVozacke()== null){
            throw new EdunovaException("Broj vozačke mora biti unesen");
            
        }
      }
    
    private void kontrolaTelefon(Klijent entitet) throws EdunovaException{
    if (entitet.getTelefon()== null || entitet.getTelefon().trim().length()==0){
    throw new EdunovaException("Broj telefona klijenta mora biti unesen");
    } 
    }
}
