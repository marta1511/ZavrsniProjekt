/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Iznajmljivanje;
import edunova.model.Klijent;
import edunova.utility.EdunovaException;
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
}
