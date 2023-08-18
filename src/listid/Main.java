package listid;

import java.util.Scanner;

public class Main {

    //Loend (List)
    //Korrastaud andmekogum, st, et säilitab elementide järjekorra
    //Enimkasutatud on ArrayList ja LinkedList

    // Kui tavalislt array-l on pikkus määratud, siis listid on dünaamilised
    //Loomisel ei pea pikkust määrama(suurust)
    //Suureneb ise vastavalt vajadusele


    private static Scanner scanner = new Scanner(System.in);
    private static GroseryList groseryList = new GroseryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Entere choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groseryList.printGrocerList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    rearchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
        //scanner.close();
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options");
        System.out.println("\t1 - To print the list of grocery items");
        System.out.println("\t2 - To add an item to the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove for an item in the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");
    }

    public static void addItem() {
        System.out.println("Enter product: ");
        groseryList.addItem(scanner.nextLine());
        //String product = scanner.nextLine();
        //groseryList.addItem(product);
    }

    public static void modifyItem() {
        System.out.println("Enter product: ");
        String item = scanner.nextLine();

        System.out.println("Enter new product: ");
        String newItem = scanner.nextLine();
        groseryList.modifyItem(item, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter product to remove: ");
        //String item = scanner.nextLine();
        //groseryList.removeItem(item);
        groseryList.removeItem(scanner.nextLine());
    }
    public static void rearchItem(){
        System.out.println("Enter product to search: ");
        String searchItem = scanner.nextLine();
        if (groseryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in list" );
        } else {
            System.out.println(searchItem + " not in list");
        }
    }

    public static String sisendToLower (){
        return scanner.nextLine().toLowerCase();
    }

}

