package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts;
    ArrayList<Contacts>list = new ArrayList<>();
    public void addNewContact() {
        contacts=new Contacts();
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
        contacts.setPin(scanner.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(scanner.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(scanner.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
    }
    public void displayContact() {
        if (contacts.getFirstname() == null) {
            System.out.println("Contact Not Found");
        } else {
            for (Contacts cont : list) {
                System.out.println(cont);
            }
        }
    }
    public void editContact() {
        contacts=new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
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
            contacts.setPin(scanner.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(scanner.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(scanner.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            list.remove(contacts);
            System.out.println("Contact Deleted Successfully-------!!!");
        }else {
            System.out.println("Not Found");
        }
    }
    public void contactOptions(AddressBook addressBook) {
        int choice;
        do {
            System.out.println("----Welcome to Address Book System----");
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Exit ");
            System.out.println("Enter Choice : ");
            choice = addressBook.scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        } while (choice != 5);
    }
}