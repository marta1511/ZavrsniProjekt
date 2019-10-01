/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Model;
import edunova.model.Zaposlenik;
import edunova.utility.EdunovaException;
import java.util.List;

/**
 *
 * @author Marta
 */
public class ObradaModel extends Obrada <Model>  {

    @Override
    protected void kontrolaSpremi(Model entiet) throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisi(Model entitet) throws EdunovaException {
        
    }

    @Override
    public List<Model> getEntiteti() {
       return session.createQuery("from Model").list();
    }
       private void kontrolaNaziv(Model entitet) throws EdunovaException {
        if (entitet.getNaziv() == null
                || entitet.getNaziv().trim().length() == 0) {
            throw new EdunovaException("Naziv modela je obavezn");
        }
}
        private void kontrolaMarka(Model entitet) throws EdunovaException{
        if(entitet.getMarka() == null || entitet.getMarka().trim().length()==0){
        throw new EdunovaException("Marka modela obavezna");}
        }
        private void kntrolaBrojSjedala(Model entitet) throws EdunovaException{
        if(entitet.getBrojSjedala() <=0 || entitet.getBrojSjedala() >9){
        throw new EdunovaException("Broj sjedala mora biti između 1 i 9");
        }
        }
        
        private void kontrolaVrstaMotora (Model entitet) throws EdunovaException{
        if(entitet.getVrstaMotora().trim().length() ==0 || entitet.getVrstaMotora() != "Benzin" || entitet.getVrstaMotora() != "Dizel"){
        throw new EdunovaException("Molim unesite vrstu motora: Benzin ili ");
        }
        }
        private void kontrolaCijenaPoDanu (Model entitet) throws EdunovaException{
        if (entitet.getCijenaPoDanu() == null  ){
        throw new EdunovaException("Obavezan unos cijene najma po danu");
        }
        }
        
}