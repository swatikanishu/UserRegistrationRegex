package com.bridgelabz;
import java.util.Scanner;
public class UserValidInput {
        static UserValidator register = new UserValidator();
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the user first name");
            String userFirstName = sc.nextLine();
            register.userValidFirstName(userFirstName);
            System.out.println("Enter the user last name");
            String userLastName = sc.nextLine();
            register.userValidLastName(userLastName);
            System.out.println("Enter the user Email");
            String userValidMail = sc.nextLine();
            register.userValidMailId(userValidMail);
            System.out.println("Enter the user mobile number");
            String userValidMobileNumber = sc.nextLine();
            register.userValidMobileNumber(userValidMobileNumber);
            System.out.println("Enter the user password");
            String userValidPassword = sc.nextLine();
            register.userValidPassword(userValidPassword);
        }
    }

