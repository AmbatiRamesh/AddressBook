package com.bridgelabz;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book Program-------");
        int choice;
        AddressBook addressBook = new AddressBook();
        do {
            System.out.println("1. Add New Contact\n2. Edit Contact\\n3. Display Contact\n4. Exit");
            System.out.println("Enter Choice: ");
            choice = addressBook.scanner.nextInt();
            if (choice == 1) {
                addressBook.addNewContact();
            } else if (choice == 2) {
                addressBook.editContact();
            } else if (choice == 3) {
                addressBook.displayContact();
            } else if (choice == 4) {
                System.out.println("Thank You for Using Address Book.");
            } else {
                System.out.println("Please Select between 1 to 4 only.");
            }
        }while( choice != 4 );
    }
}

