package com.bridgelabz;
import java.util.regex.Pattern;
public class UserRegistration {
    public static boolean givenFirstName_WhenValid_ShouldReturnTrue(String validFirstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstName);
    }

    public static void main(String[] args) {
                boolean firstName = givenFirstName_WhenValid_ShouldReturnTrue("Riya");
                System.out.println("first name is valid" + firstName);
    }

}