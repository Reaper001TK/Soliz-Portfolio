package ApartmentsLinked;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentsLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store Apartment objects
        LinkedList<Apartment> apartmentList = new LinkedList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for values for Apartments and add them to the LinkedList
        while (true) {
            System.out.println("Enter apartment details or type 'exit' to finish:");

            System.out.print("Street Address: ");
            String streetAddress = scanner.nextLine();

            if (streetAddress.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Apartment Number: ");
            int apartmentNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Monthly Rent: ");
            double monthlyRent = Double.parseDouble(scanner.nextLine());

            System.out.print("Number of Bedrooms: ");
            int numberOfBedrooms = Integer.parseInt(scanner.nextLine());

            // Create an Apartment object and add it to the LinkedList
            Apartment apartment = new Apartment(streetAddress, apartmentNumber, monthlyRent, numberOfBedrooms);
            apartmentList.add(apartment);
        }

        // Sort the Apartments by rent value
        Collections.sort(apartmentList);

        // Display the sorted list
        System.out.println("\nSorted Apartments by Monthly Rent:");
        for (Apartment apartment : apartmentList) {
            System.out.println(apartment);
        }

        // Close the scanner
        scanner.close();
    }
}
