/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

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
public class ObradaVozilo extends Obrada <Vozilo> {

    @Override
    protected void kontrolaSpremi(Vozilo entiet) throws EdunovaException {
            }

    @Override
    protected void kontrolaBrisi(Vozilo entitet) throws EdunovaException {
        
    }

    @Override
    public List<Vozilo> getEntiteti() {
        return session.createQuery("from Vozilo").list();
    }
        public List<Vozilo> getVozila(String uvjet) {
        return session.createQuery("from Vozilo a where a.naziv like :uvjet or a.registracijaskaOznaka like :uvjet")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }
      private void kontrolaNaziv(Vozilo entitet) throws EdunovaException {
        if (entitet.getNaziv() == null
                || entitet.getNaziv().trim().length() == 0) {
            throw new EdunovaException("Naziv modela je obavezn");
        }
}
        private void kontrolaMarka(Vozilo entitet) throws EdunovaException{
        if(entitet.getMarka() == null || entitet.getMarka().trim().length()==0){
        throw new EdunovaException("Marka modela obavezna");}
        }
        private void kntrolaBrojSjedala(Vozilo entitet) throws EdunovaException{
        if(entitet.getBrojSjedala() <=0 || entitet.getBrojSjedala() >9){
        throw new EdunovaException("Broj sjedala mora biti između 1 i 9");
        }
        }
        
        private void kontrolaDatumRegistracije(Vozilo entitet) throws EdunovaException{
        if(entitet.getDatumRegistracije()==null) {
            return;
        }
        
        if(entitet.getDatumRegistracije().after(new Date())){
            throw new EdunovaException("Datum početka ne može biti nakon danas");
        }
        
        GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR, 1);
        if(entitet.getDatumRegistracije().before(c.getTime())){
            throw new EdunovaException("Datum registracije ne može biti više od godinu dana od danas");
        }
        }
        private void kontrolaCijenaPoDanu (Vozilo entitet) throws EdunovaException{
        if (entitet.getCijenaPoDanu() == null  ){
        throw new EdunovaException("Obavezan unos cijene najma po danu");
        }
        }
}
