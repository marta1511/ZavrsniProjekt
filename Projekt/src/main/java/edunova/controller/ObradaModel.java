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
    protected void KontrolaSpremi(Model entiet) throws EdunovaException {
        
    }

    @Override
    protected void KontrolaBrisi(Model entitet) throws EdunovaException {
        
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
        
}