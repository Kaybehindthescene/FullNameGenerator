package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    static void main() {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = nameScanner.nextLine().trim();
        String[] brokenFullName = fullName.split(" ");

        if (brokenFullName.length == 2){
           System.out.println("First Name: " + brokenFullName[0]);
           System.out.println("Middle Name: (none)");
           System.out.println("Last name: " + brokenFullName[1]);
        }else if (brokenFullName.length == 3){
            System.out.println("First name: " + brokenFullName[0]);
            System.out.println("Middle Name:" + brokenFullName[1]);
            System.out.println("Last Name: " + brokenFullName[2]);
        }else {
            System.out.println("Invalid input! Please write in either 'First Last' or 'First Middle Last' format");
        }














    }
}
