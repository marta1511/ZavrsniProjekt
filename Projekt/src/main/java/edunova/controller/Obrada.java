/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.utility.EdunovaException;
import org.hibernate.Session;

/**
 *
 * @author Marta
 */
public abstract class Obrada <T> {
    
    protected abstract void KontrolaSpremi()throws EdunovaException;
    protected abstract void KontrolaBrisi () throws EdunovaException;
    
    protected Session session;
    
    public T spremi (T entitet) throws EdunovaException {
        KontrolaSpremi();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
    public void brisi (T entitet)throws EdunovaException{
        KontrolaBrisi();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    
      
    }

  
    
    

