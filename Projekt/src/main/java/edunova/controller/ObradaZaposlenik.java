/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.model.Klijent;
import edunova.model.Zaposlenik;
import edunova.utility.EdunovaException;
import java.util.List;
import org.iban4j.IbanFormat;
import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

/**
 *
 * @author Marta
 */
public class ObradaZaposlenik extends ObradaOsoba<Zaposlenik>{

    @Override
    public List<Zaposlenik> getEntiteti() {
         return session.createQuery("from Zaposlenik").list();
    }
   
 @Override
    protected void kontrolaSpremi(Zaposlenik entitet) throws EdunovaException {
        super.kontrolaSpremi(entitet); //kontrole ObradaOsoba
        kontrolaIBAN(entitet.getIban());
       
    }
    
     @Override
    protected void kontrolaBrisi(Zaposlenik entitet) throws EdunovaException {
        super.kontrolaBrisi(entitet); 
    }
    
    protected void kontrolaIBAN(String iban) throws EdunovaException{
        
        if (iban.length() > 32){
            throw new EdunovaException("OIB mora imati manje od 32 znaka");
        }
          

      try {
          IbanUtil.validate(iban);
          IbanUtil.validate(iban, IbanFormat.Default);
     // valid
 } catch (IbanFormatException |
          InvalidCheckDigitException |
          UnsupportedCountryException ex) {
     throw new EdunovaException("IBAN nije valjan");
 }
}
}
      


  
