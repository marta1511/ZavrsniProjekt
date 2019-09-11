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
    protected void KontrolaSpremi(Vozilo entiet) throws EdunovaException {
            }

    @Override
    protected void KontrolaBrisi(Vozilo entitet) throws EdunovaException {
        
    }

    @Override
    public List<Vozilo> getEntiteti() {
        return session.createQuery("from Vozilo").list();
    }
    
    
}
