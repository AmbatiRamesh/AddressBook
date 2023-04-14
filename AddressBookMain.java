package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book Program-------");
        Scanner sc = new Scanner(System.in);
        int choice;
        AddressBook addressBook = new AddressBook();
        do {
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact"
                    + "\n4. Display Contact\n5. Search by State\n6. Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addressBook.addNewContact();
                case 2 -> addressBook.editContact();
                case 3 -> addressBook.deleteContact();
                case 4 -> addressBook.displayContact();
                case 5 -> {
                    System.out.println("1. Search by City\n2. Search by State\n3. Exit");
                    System.out.println("Choice :");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            addressBook.searchByCity();
                            break;
                        case 2:
                            addressBook.searchByState();
                            break;
                        case 3:
                            System.out.println("Thank you");
                        default:
                            System.out.println("Please Select Valid Input");
                    }
                }
                case 6 -> System.out.println("Thank You for Using Address Book.");
                default -> System.out.println("Please Select between 1 to 6 only.");
            }
        } while (choice != 6);
    }
}
