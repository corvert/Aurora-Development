package phone;

import java.util.Scanner;

public class Main {

//Simuleerime lihtsat mobiiltelefoni
    //funktiooni
    //hoiab, muudab, eemaldab, lisab ja näitab kontake
    //Eraldi klass kontakite jaoks (Contact) (hoiab nime, nr)
    //MobilePhone klass, mis hoiab Contacts Arraylistis

    //Teeme menüü
    // quit, print list, lisa kontakt, uuenda kontakt, eemalda kontakt, otsi kontakt

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1234542");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        int choice;
        while (!quit) {
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
        System.out.println("Sisesta uus kontakt: ");
        String name = scanner.nextLine();
        System.out.println("Sisesta number");
        String number = scanner.nextLine();

        Contact contact = new Contact(name, number);

        mobilePhone.addContact(contact);


    }

    private static void updateContact() {
        System.out.println("Sisesta kontakt mida soovid muuta: ");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.searchContact(name);
        if (extContact == null) {
            System.out.println("ei leia");
        }
        System.out.println("Sisesta uus nimi");
        String newName = scanner.nextLine();
        System.out.println("Siesta uus number");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(extContact, newContact)){
            System.out.println("edukalt uuendatud");
        }else {
            System.out.println("Error");
        }



    }

    private static void removeContact() {
        System.out.println("Keda soovid eemaltada");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.searchContact(name);
        if (extContact == null) {
            System.out.println("Kontakti ei leitud");
            return;
        }
        if (mobilePhone.removeContact(extContact)){
            System.out.println("Kustuatud ");
        }else {
            System.out.println("error");
        }


    }

    private static void searchContact() {
        System.out.println("Sisesta otistvatv kontakt");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.searchContact(name);
        if (extContact == null) {
            System.out.println("Ei leia");
            return;
        }
        System.out.println("Nimi " + extContact.getName() + " Number on " + extContact.getPhoneNumber());

    }

    private static void printActions() {
        System.out.println("\n Saadaval ülesanded: \n vajusta");
        System.out.println("0 - sulge \n" +
                "1 - näita kontaktid \n" +
                "2 - lisa uus kontakt \n" +
                "3 - uuenda kontakti \n" +
                "4 - kustuta kontakt \n" +
                "5 - otsi kontakti \n" +
                "6 - näita kõiki tegevusi");
        System.out.println("Vali tegevus");

    }
}
