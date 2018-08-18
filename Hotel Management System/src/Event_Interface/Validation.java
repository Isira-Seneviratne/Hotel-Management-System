/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tharaka
 */
public class Validation {
    
    public static boolean emailValidate(String email){
        
        boolean status = false;
        String Email_PATTERN ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.A-Za-z||{2,})$";
        Pattern pattern = Pattern.compile(Email_PATTERN);
        Matcher matcher = pattern.matcher(email);
        status = matcher.matches();
        return status;
    }
    
    public static boolean nicValidation(String nic){
        return nic.length() == 10 && nic.matches("^[0-9]{9}[Vv]$");
    }
}
