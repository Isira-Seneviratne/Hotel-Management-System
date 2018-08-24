/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer_Interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Oshitha
 * 
 * @author Isira Seneviratne (19440268)
 */
public class ValidationOperations {
    public static boolean validateEmail(String email) {
	Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
	Matcher matcher = pattern.matcher(email);
	
        return matcher.matches();
    }

    public static boolean validateNIC(String nic) {
        Pattern pattern = Pattern.compile("^[0-9]{9}[vVxX]$");
	Matcher matcher = pattern.matcher(nic);
        
        return matcher.matches();
    }
}