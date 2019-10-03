/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Marta
 */
public class Utility {
 
    public static String getNazivAplikacije (){
    return "Rent a car APP";
    }
    
     public static String getFormatDatumaIVremena(){
        return "dd. MM. YYYY. HH:mm:ss";
    }
    
    public static boolean isDev(){
        return true;
    }

    public static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
          .atZone(ZoneId.systemDefault())
            .toInstant());
    }
}
