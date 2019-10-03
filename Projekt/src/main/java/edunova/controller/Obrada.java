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
    
    protected abstract void kontrolaSpremi(T entiet)throws EdunovaException;
    protected abstract void kontrolaBrisi (T entitet) throws EdunovaException;
    public abstract List<T> getEntiteti();
    
    protected Session session;
    
    public Obrada() {
        this.session = HibernateUtil.getSession();
    }
    
    public T spremi (T entitet) throws EdunovaException {
        kontrolaSpremi(entitet);
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    
    public void brisi (T entitet)throws EdunovaException{
        kontrolaBrisi(entitet);
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }

    
      
    }

  
    
    

