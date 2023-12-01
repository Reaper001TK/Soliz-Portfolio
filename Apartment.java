package ApartmentsLinked;

//Apartment.java
public class Apartment implements Comparable<Apartment> {
 private String streetAddress;
 private int apartmentNumber;
 private double monthlyRent;
 private int numberOfBedrooms;

 // Constructor
 public Apartment(String streetAddress, int apartmentNumber, double monthlyRent, int numberOfBedrooms) {
     this.streetAddress = streetAddress;
     this.apartmentNumber = apartmentNumber;
     this.monthlyRent = monthlyRent;
     this.numberOfBedrooms = numberOfBedrooms;
 }

 // Getter methods (if needed)

 // toString method to display Apartment values
 @Override
 public String toString() {
     return "Apartment{" +
             "streetAddress='" + streetAddress + '\'' +
             ", apartmentNumber=" + apartmentNumber +
             ", monthlyRent=" + monthlyRent +
             ", numberOfBedrooms=" + numberOfBedrooms +
             '}';
 }

 // compareTo method to compare Apartment objects based on rent value
 @Override
 public int compareTo(Apartment other) {
     // Compare based on monthly rent
     return Double.compare(this.monthlyRent, other.monthlyRent);
 }
}
