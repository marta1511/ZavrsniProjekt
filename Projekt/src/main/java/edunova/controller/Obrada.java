/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.utility.EdunovaException;
import edunova.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Marta
 */
public abstract class Obrada <T> {
    
    protected abstract void KontrolaSpremi(T entiet)throws EdunovaException;
    protected abstract void KontrolaBrisi (T entitet) throws EdunovaException;
    public abstract List<T> getEntiteti();
    
    protected Session session;
    
    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    
    public T spremi (T entitet) throws EdunovaException {
        KontrolaSpremi(entitet);
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
    public void brisi (T entitet)throws EdunovaException{
        KontrolaBrisi(entitet);
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    
      
    }

  
    
    

