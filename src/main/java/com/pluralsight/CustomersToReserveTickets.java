package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CustomersToReserveTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String fullName = scanner.nextLine(); // Mohammad Hussain
        System.out.print("Enter the date this formate (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();
        System.out.print("How many ticket you buy: ");
        int ticket = scanner.nextInt();

        //=============================================
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace+1);

        //===========================================


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate convertedDate = LocalDate.parse(dateInput, formatter);


       // System.out.println(ticket + " tickets reserve for " + convertedDate + " under " + lastName + ", " + firstName);

        if (ticket ==1) {
            System.out.println(ticket + " ticket reserve for " + convertedDate + " under " + lastName + ", " + firstName);
        } else if (ticket >= 1) {
            System.out.println(ticket + " tickets reserve for " + convertedDate + " under " + lastName + ", " + firstName);
        }else{
            System.out.println( " Don't show up anything");

            scanner.close();
        }


    }
}
