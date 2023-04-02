package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts = new Contacts();
    public void addNewContact() {
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(scanner.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(scanner.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the City :");
        contacts.setCity(scanner.next());
        System.out.println("Enter the State :");
        contacts.setState(scanner.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(scanner.nextLong());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(scanner.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
    }
    public void displayContact() {
        System.out.println("--------------------------------------------");
        System.out.println("Contact Details :-");
        System.out.println("Name : "+contacts.getFirstname()+" "+contacts.getLastname());
        System.out.println("Address : "+contacts.getAddress());
        System.out.println("City : "+contacts.getCity());
        System.out.println("State : "+contacts.getState());
        System.out.println("PIN Code : "+contacts.getPin());
        System.out.println("Phone Number : "+contacts.getPhoneNumber());
        System.out.println("EMail ID : "+contacts.getEmail());
        System.out.println("---------------------------------------------");
    }
}
