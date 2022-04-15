package com.blz.lamdaexpressions;
import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface firstname {
    void validUser(String name);
}

@FunctionalInterface
interface Lastname {
    void validUser(String name);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        firstname fn = (name)->{
            boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
            if (check == true) {
                System.out.println("Firstname is Valid");
            }else
                System.out.println("Enter valid name");
        };
        fn.validUser("Varshasree");

        Lastname lastname = (name)->{
            boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
            if (check == true) {
                System.out.println("Lastname is Valid");
            }else
                System.out.println("Enter valid name");
        };
        lastname.validUser("Mirrd");




    }
}


