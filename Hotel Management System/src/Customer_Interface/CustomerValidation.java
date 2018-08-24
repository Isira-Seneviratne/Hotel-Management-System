/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer_Interface;

//import HRMS_Interface.InterviewManagement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class CustomerValidation {
    public static boolean status = false;

    public static boolean emailValidate(String email) {
        //boolean status = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        status = matcher.matches();
        return status;
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLetter(String ltr) {
        return ltr.matches("^[\\p{L} .'-]+$");
    }

    public static boolean nicValidation(String nic) {
        return nic.length() == 10 && nic.matches("^[0-9]{9}[Vv]$");
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static boolean isValidDate(String date) {
        String inputdate = "2017-09-23";
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            formatter.parse(inputdate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    

    public static boolean isphone(String mnumber) {
        if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '0' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '1' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '2' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '5' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '6' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '7' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        } else if (mnumber.charAt(0) == '0' && mnumber.charAt(1) == '7' && mnumber.charAt(2) == '8' && mnumber.length() == 10 && mnumber.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    public static boolean bookingidValidate(String eid) {
        return eid.length() == 5 && eid.matches("^[B][0-9]{4}$");
    }

    public static boolean isValidTime(String t) {
        return t.matches("([01]?[0-9]|2[0-3]).[0-5][0-9]");
    }
}
