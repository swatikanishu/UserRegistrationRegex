package com.bridgelabz;
import java.util.regex.Pattern;
public class UserRegistration {
    public static boolean givenFirstName_WhenValid_ShouldReturnTrue(String validFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstName);
    }

    public static boolean givenLastName_WhenValid_ShouldReturnTrue(String validLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validLastName);
    }
    public static boolean givenEmail_WhenValid_ShouldReturnTrue(String validUserMail) {
        return Pattern.matches("^[a-z]+([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$", validUserMail);
    }
    public static void main(String[] args) {
                boolean firstName = givenFirstName_WhenValid_ShouldReturnTrue("Riya");
                System.out.println("first name is valid" + firstName);
        boolean lastName = givenFirstName_WhenValid_ShouldReturnTrue("Meera");
        System.out.println("lastName is valid" + lastName);
        boolean validUserMail = givenEmail_WhenValid_ShouldReturnTrue("abc.xyz@bl.co.in");
        System.out.println("user mail id is valid" + validUserMail);
    }

}