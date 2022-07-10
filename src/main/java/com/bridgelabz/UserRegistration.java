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
    public static boolean givenUserMobileNum_WhenValidFormat_ShouldReturnTrue(String validUserMobileNum) {
        return Pattern.matches("^(91)[\\s][0-9]{10}", validUserMobileNum);
    }
    public static boolean givenPassword_WhenValid_ShouldReturnTrue(String validUserPassword) {
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", validUserPassword);
    }
    public static boolean givenSampleEmails_WhenValid_ShouldReturnTrue(String validEmailSample) {
        return Pattern.matches("^(abc)([+-.]?[\\d])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", validEmailSample);
    }


    public static void main(String[] args) {
        boolean firstName = givenFirstName_WhenValid_ShouldReturnTrue("Riya");
        System.out.println("first name is valid" + firstName);
        boolean lastName = givenFirstName_WhenValid_ShouldReturnTrue("Meera");
        System.out.println("lastName is valid" + lastName);
        boolean validUserMail = givenEmail_WhenValid_ShouldReturnTrue("abc.xyz@bl.co.in");
        System.out.println("user mail id is valid" + validUserMail);
        boolean validUserMobileNum = givenUserMobileNum_WhenValidFormat_ShouldReturnTrue("91 2345677892");
        System.out.println("user mobile number is valid" + validUserMobileNum);
        boolean validUserPassword = givenPassword_WhenValid_ShouldReturnTrue("wertP7$%");
        System.out.println("user password of minimum 8 char and at least 1 upper case,1 num,1 special char is valid" + validUserPassword);
        boolean validSampleEmail1 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc@yahoo.com");
        System.out.println("email is valid" + validSampleEmail1);
        boolean validSampleEmail2 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc-100@yahoo.com");
        System.out.println("email is valid" + validSampleEmail2);
        boolean validSampleEmail3 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc.100@yahoo.com");
        System.out.println("email is valid" + validSampleEmail3);
        boolean validSampleEmail4 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc111@abc.com");
        System.out.println("email is valid" + validSampleEmail4);
        boolean validSampleEmail5 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc-100@abc.net");
        System.out.println("email is valid" + validSampleEmail5);
        boolean validSampleEmail6 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc.100@abc.com.au");
        System.out.println("email is valid" + validSampleEmail6);
        boolean validSampleEmail7 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc@1.com");
        System.out.println("email is valid" + validSampleEmail7);
        boolean validSampleEmail8 = givenSampleEmails_WhenValid_ShouldReturnTrue("abc@gmail.com.com");
        System.out.println("email is valid" + validSampleEmail8);
    }
}


