package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static void main() {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = nameScanner.nextLine().trim();

        System.out.println("What is your middle name or initial if you have one?");
        String middleName = nameScanner.nextLine().trim();

        System.out.println("What is your last name?");
        String lastName = nameScanner.nextLine().trim();


        System.out.println("What is your suffix if you have one?");
        String suffix = nameScanner.nextLine().trim();

        String fullName = firstName;

        if (middleName.length() == 1){
            middleName += ".";
        }
        if (middleName.length() > 0){
            fullName = firstName += " " + middleName;

        }

        fullName += " " + lastName;

        if (suffix.length() > 0){
            fullName += ", " + suffix;
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " +lastName);
        System.out.println("Suffix: "  + suffix);
        System.out.println("Full Name: " + fullName);












    }
}
