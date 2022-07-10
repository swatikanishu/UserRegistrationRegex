package com.bridgelabz;
import java.util.regex.Pattern;
public class UserValidator {
    public boolean userValidFirstName(String userFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", userFirstName);
    }
    public boolean userValidLastName(String userLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", userLastName);
    }
    public boolean userValidMailId(String uservalidMail) {
        return Pattern.matches("^(abc)([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$", uservalidMail);
    }
    public boolean userValidMobileNumber(String userValidMobileNumber) {
        return Pattern.matches("^(91)[\\s][0-9]{10}", userValidMobileNumber);
    }
    public boolean userValidPassword(String userValidPassword) {
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&]).{8}$", userValidPassword);
    }

    public boolean userValidSampleMail(String userValidSampleMail) {
        return Pattern.matches("^(abc)([+-.]?[\\d])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", userValidSampleMail);
    }
}