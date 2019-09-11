/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.model.Zaposlenik;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Marta
 */
public class ObradaZaposlenik extends Obrada<Zaposlenik>{

    @Override
    protected void KontrolaSpremi(Zaposlenik entiet) throws EdunovaException {
        kontrolaIme(entiet);
        kontrolaPrezime(entiet);
        kontrolaTelefon(entiet);
        kontrolaOIB(entiet.getOib());
    }

    @Override
    protected void KontrolaBrisi(Zaposlenik entitet) throws EdunovaException {
      
    }

    @Override
    public List<Zaposlenik> getEntiteti() {
      return session.createQuery("from Zaposlenik").list();
    }
     private void kontrolaIme (Zaposlenik entitet) throws EdunovaException{
    if(entitet.getIme() == null || entitet.getIme().trim().length()==0){
    throw new EdunovaException("Obavezno unijeti ime zaposlenika");}
    }
     private void kontrolaPrezime (Zaposlenik entitet) throws EdunovaException{
    if(entitet.getPrezime()== null || entitet.getPrezime().trim().length()==0){
    throw new EdunovaException("Obavezno unijeti prezime zaposlenika");
    }
     }
     private void kontrolaTelefon(Zaposlenik entitet) throws EdunovaException{
    if (entitet.getTelefon()== null || entitet.getTelefon().trim().length()==0){
    throw new EdunovaException("Broj telefona mora biti unesen");}
    
    }
     
     //još napravit kontorlu za iban
     private void kontrolaIBAN (Zaposlenik entitet) throws EdunovaException{
     
   

     }
      
  

   protected void kontrolaOIB(String oib)throws EdunovaException {
        if (oib.length() != 11){
            throw new EdunovaException("OIB mora imati 11 znamenaka");
        }
            

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            throw new EdunovaException("OIB ima znak koji nije brojčani");
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i+1));
            a = a % 10;
            if (a == 0)
                a = 10;
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10)
            kontrolni = 0;

        if(kontrolni != Integer.parseInt(oib.substring(10))){
            throw new EdunovaException("OIB je neispravan");
        }
    }
}
