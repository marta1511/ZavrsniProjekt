/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

/**
 
 * @author Marta
 */
public class EdunovaException extends Exception{
    
    private String poruka;

    public String getPoruka() {
        return poruka;
    }

    public EdunovaException(String poruka) {
        this.poruka = poruka;
    }
    
    
}
