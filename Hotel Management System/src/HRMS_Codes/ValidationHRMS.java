/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRMS_Codes;

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
public class ValidationHRMS {
    
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
        Date gdate = null;
        String inputdate = "2017-09-23";
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            gdate = formatter.parse(inputdate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean isHomePhone(String hnumber) {
        if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '6' && hnumber.charAt(2) == '3' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '5' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '6' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '5' && hnumber.charAt(2) == '5' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '5' && hnumber.charAt(2) == '7' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '6' && hnumber.charAt(2) == '5' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '2' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '1' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '9' && hnumber.charAt(2) == '2' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '3' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '4' && hnumber.charAt(2) == '7' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '5' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '6' && hnumber.charAt(2) == '7' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '4' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '8' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '5' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '7' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '3' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '6' && hnumber.charAt(2) == '6' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '4' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '5' && hnumber.charAt(2) == '4' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '1' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '5' && hnumber.charAt(2) == '2' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '3' && hnumber.charAt(2) == '8' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '7' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '4' && hnumber.charAt(2) == '5' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '6' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        } else if (hnumber.charAt(0) == '0' && hnumber.charAt(1) == '2' && hnumber.charAt(2) == '4' && hnumber.length() == 10 && hnumber.matches("[0-9]+")) {
            return true;
        }
        return false;
    }

    public static boolean isMobilePhone(String mnumber) {
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

    public static boolean empidValidate(String eid) {
        return eid.length() == 5 && eid.matches("^[e][0-9]{4}$");
    }

    public static boolean canidValidate(String cid) {
        return cid.length() == 5 && cid.matches("^[c][0-9]{4}$");
    }

    public static boolean intIDValidate(String intid) {
        return intid.length() == 5 && intid.matches("^[i][0-9]{4}$");
    }

    public static boolean isValidTime(String t) {
        return t.matches("([01]?[0-9]|2[0-3]).[0-5][0-9]");
    }

}
