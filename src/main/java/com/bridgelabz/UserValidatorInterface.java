package com.bridgelabz;

public class UserValidatorInterface {
    @FunctionalInterface
    public interface Validate {
        // Declaring an Abstract method
        boolean validate(String input);
    }

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z][a-z]{2,}");
    }

    public static Validate validateLastName() {
        return lastName -> lastName.matches("[A-Z][a-z]{2,}");
    }

    public static Validate validateEmail() {
        return email -> email.matches("^(abc)([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$");
    }
    public static Validate validateMobileNumber() {
        return mobileNumber -> mobileNumber.matches("^(91)[\\s][0-9]{10");
    }

    public static Validate validatePassword() {
        return password -> password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&]).{8}$");
    }
}

