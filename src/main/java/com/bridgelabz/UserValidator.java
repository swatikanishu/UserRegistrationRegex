package com.bridgelabz;
import java.util.regex.Pattern;
public class UserValidator{
        boolean result;

        public boolean userValidFirstName(String userFirstName) {
            result = Pattern.matches("^[A-Z][a-z]{2,}", userFirstName);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid User First Name");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public boolean userValidLastName(String userLastName) {
            result = Pattern.matches("^[A-Z][a-z]{2,}", userLastName);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid User Last Name");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public boolean userValidMailId(String userValidMail) {
            result = Pattern.matches("^(abc)([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$", userValidMail);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid User mail id");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public boolean userValidMobileNumber(String userValidMobileNumber) {
            result = Pattern.matches("^(91)[\\s][0-9]{10}", userValidMobileNumber);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid User mobile number");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public boolean userValidPassword(String userValidPassword) {
            result = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&]).{8}$", userValidPassword);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid user password");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public boolean userValidSampleMail(String userValidSampleMail) {
            result = Pattern.matches("^(abc)([+-.]?[\\d])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", userValidSampleMail);
            try {
                if (!result)
                    throw new UserValidatorException("Invalid mail");
            } catch (UserValidatorException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }
    }