/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Iznajmljivanje;
import edunova.model.Klijent;
import edunova.model.Vozilo;
import edunova.utility.EdunovaException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Marta
 */
public class ObradaIznajmljivanje extends Obrada <Iznajmljivanje> {

    @Override
    protected void kontrolaSpremi(Iznajmljivanje entiet) throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisi(Iznajmljivanje entitet) throws EdunovaException {
        
    }

    @Override
    public List<Iznajmljivanje> getEntiteti() {
        return session.createQuery("from Iznajmljivanje").list();
    }
       public List<Iznajmljivanje> getBrojUgovora(String uvjet) {
        return session.createQuery("from Iznajmljivanje a "
                + " where a.brojUgovora like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
       
         private void kontrolaDatumPreuzimanja(Iznajmljivanje entitet) throws EdunovaException{
        if(entitet.getDatumPreuzimanja()==null) {
            return;
        }
         if(entitet.getDatumPreuzimanja().before(new Date())){
            throw new EdunovaException("Datum početka najma ne može biti prije danas");
        }
        
        GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, 1);
        if(entitet.getDatumPreuzimanja().after(c.getTime())){
            throw new EdunovaException("Datum početka najma ne može biti nakon jedne godine od danas");
        }
}
          private void kontrolaDatumPovratka(Iznajmljivanje entitet) throws EdunovaException{
        if(entitet.getDatumPovratka()==null) {
            return;
        }
         if(entitet.getDatumPovratka().before(new Date())){
            throw new EdunovaException("Datum povratka vozila ne može biti prije danas");
        }
          GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.MONTH, 1);
        if(entitet.getDatumPreuzimanja().after(c.getTime())){
            throw new EdunovaException("Datum povratka vozila može biti maximalno mjesec dana od danas");
        }

          }
 
         
}