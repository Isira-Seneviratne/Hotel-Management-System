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
 */
public class ValidationO {
    
    
    public static boolean validateEmail(String email){

	boolean status=false;
	String EMAIL_PATTERN =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	Matcher matcher = pattern.matcher(email);
	if (matcher.matches())
	{
		status = true;
	}
	else
	{
		status = false;
	}
        return status;
    }

    public static boolean nicValidation(String nic) {
        
        boolean status1=false;
        String NIC_PATTERN = "^[0-9]{9}[vVxX]$";
        //return nic.length()-- 10 && nic.matches("^[0-9]{9}[Vv]$");
        Pattern pattern = Pattern.compile(NIC_PATTERN);
	Matcher matcher = pattern.matcher(nic);
	if (matcher.matches())
	{
		status1 = true;
	}
	else
	{
		status1 = false;
	}
	return status1;
    }
}
