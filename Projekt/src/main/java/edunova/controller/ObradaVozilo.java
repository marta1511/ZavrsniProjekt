/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Vozilo;
import edunova.utility.EdunovaException;
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
        
        private void kontrolaVrstaMotora (Vozilo entitet) throws EdunovaException{
        if(entitet.getVrstaMotora().trim().length() ==0 || entitet.getVrstaMotora() != "Benzin" || entitet.getVrstaMotora() != "Dizel"){
        throw new EdunovaException("Molim unesite vrstu motora: Benzin ili ");
        }
        }
        private void kontrolaCijenaPoDanu (Vozilo entitet) throws EdunovaException{
        if (entitet.getCijenaPoDanu() == null  ){
        throw new EdunovaException("Obavezan unos cijene najma po danu");
        }
        }
}
