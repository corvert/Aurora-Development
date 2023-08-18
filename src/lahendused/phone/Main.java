package lahendused.phone;

import java.util.Scanner;

public class Main {

    //Simuleerime lihtsat mobiiltelefoni
    //Funktsioonid:
    //Hoiab, muuudab, eemaldab, lisab ja näitab kontakte
    //Eraldi klass kontaktide jaoks (Contact) (hoiab nime, nr)
    //MobilePhone klass, mis hoiab Contacts ArrayListis

    //Teeme menüü:
    //Quit, print list, lisa kontakt, uuenda kontakt,
    // eemalda kontakt, otsi kontakt

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1232235");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        int choice;
        while(!quit) {
            System.out.println("Enter choice (6 - menu)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Phone turning on...");
    }
    private static void addNewContact() {
        System.out.println("Sisesta uus nimi");
        String name = scanner.nextLine();
        System.out.println("Siseta uus number");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);
        //Contact newContact = new Contact(name, phone);
        if(mobilePhone.addContact(newContact)){
            System.out.println("Uus kontakt lisatud " + name + ", number " + phone);
        } else {
            System.out.println("Lisamine ebaõnnestus, " + name + " on juba olemas");
        }

    }
    private static void updateContact() {
        System.out.println("Sisesta kontakt mida soovid muuta");
        String name = scanner.nextLine();
        Contact contactRecord = mobilePhone.searchContact(name);
        if (contactRecord == null){
            System.out.println("Ei leia kontakti");
            return; //hüppab meetodist välja
        }
        System.out.println("Sisesta uus nimi");
        String newName = scanner.nextLine();
        System.out.println("Sesesta uus number");
        String newPhone = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(contactRecord, newContact)){
            System.out.println("Edukalt uuentatud");
        } else {
            System.out.println("Error uuendamisel");
        }

    }
    private static void removeContact() {
        System.out.println("Siseta kontakt mida soovid kustutada");
        String name = scanner.nextLine();
        Contact contactRecord = mobilePhone.searchContact(name);
        if (contactRecord == null){
            System.out.println("Ei leia kontakti");
            return;
        }
        if (mobilePhone.removeContact(contactRecord)){
            System.out.println("Edukalt kustutatud");
        } else {
            System.out.println("Error kustutamisel");
        }


    }
    private static void searchContact() {
        System.out.println("Sisesta kontakt mida soovid leida");
        String name = scanner.nextLine();
        Contact contactRecord = mobilePhone.searchContact(name);
        if (contactRecord == null){
            System.out.println("Ei leia kontakti");
            return;
        }
        System.out.println("Nimi: " + contactRecord.getName() + " number on: " + contactRecord.getPhoneNumber());

    }
    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println( "0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if a contact exists\n" +
                "6 - to print a list of available actions");
        System.out.println("Choose your action: ");

    }

}
