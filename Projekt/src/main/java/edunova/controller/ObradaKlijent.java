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
    
    public List <Klijent> getKlijent (){
    return session.createQuery("from Klijent").list();
    }

    @Override
    protected void KontrolaSpremi() throws EdunovaException {
       
    }

    @Override
    protected void KontrolaBrisi() throws EdunovaException {
        
    }
    
}
