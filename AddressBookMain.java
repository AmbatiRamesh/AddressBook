package com.bridgelabz;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book Program-------");
        int choice;
        do {
            System.out.println("1. Add New AddressBook \n2. Delete AddressBook" + "\n3. Display AddressBook\n4. Add Contact\n5. Exit");
            System.out.println("Enter Choice: ");
            choice = AddressBookCollection.userInput();

            switch (choice) {
                case 1:
                    AddressBookCollection.addNewAddressBook();
                    break;
                case 2:
                    AddressBookCollection.deleteAddressBook();
                    break;
                case 3:
                    AddressBookCollection.displayAddressBooks();
                    break;
                case 4:
                    AddressBookCollection.selectAddressBook();     
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select between 1 to 6 only.");
                    break;
            }
        }
        while( choice !=5 );
    }
}

