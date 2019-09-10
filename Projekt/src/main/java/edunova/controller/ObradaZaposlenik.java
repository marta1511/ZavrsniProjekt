/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

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
}
