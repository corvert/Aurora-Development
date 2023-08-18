package lahendused.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    // LinkedList - parem kasutada kui on vaja kiiresti lisada ja eemalda elemente

    /*
    tee meetod visit (void)
    while loop
    võib teha menüü ja switch (sh scanner)
    printib linna , võimaldab liikuda järgmisesse ja eelmisesse linna

    kasuta listiteraatorit
    Kasuks tulevad järgmised iteraatori meetodid
    .isEmpty()
    .hasNext()
    .next()
    .hasPrevious()
    .previous

    menüüs 4 valikut : 0-Quit, 1-edasi, 2-tagasi, 3-print menüü
     */

    public static void main(String[] args) {


        LinkedList<String> placesToVisit = new LinkedList<>();
        // placesToVisit.add("Tartu");
        //placesToVisit.add("Pärnu");
        //placesToVisit.add("Haapsalu");
        //placesToVisit.add(1, "Rapla");

        addInOrder(placesToVisit, "Tartu");
        addInOrder(placesToVisit, "Pärnu");
        addInOrder(placesToVisit, "Haaplasu");
        addInOrder(placesToVisit, "Narva");
        addInOrder(placesToVisit, "Valga");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Rapla");
        printList(placesToVisit);
        visit(placesToVisit);


        placesToVisit.remove(3);
        printList(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Praegu linnas: " + i.next());
        }
        System.out.println("***********************");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //võrdesed
                System.out.println(newCity + " on juba listis");
                return false;
            } else if (comparison > 0) {
                //uus linn peaks olema enne preagust (eelmist) linna
                listIterator.previous();
                listIterator.add(newCity);
                //list iteraator lubab tagasi minna
                return true;
            } else if (comparison < 0) {
                //iteraator liigub edasi, ei puutu idagi(mdiagi ei muutu)
                //pole veel õigesse kohta jõunud
            }
        }
        linkedList.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = cities.listIterator();
        boolean goingForward = true;

        if (cities.isEmpty()) {
            System.out.println("Pole linna kuhu minna");
            return; //void meetodi puhul saame return ikka kasutada, et meetodist väljuda
        } else {
            System.out.println("Asud linnas " + listIterator.next());
        }
        printMenu();
        int valik;
        while (!quit) {
            System.out.println("Tee valik");
            valik = scanner.nextInt();
            scanner.nextLine();

            switch (valik) {
                case 0:
                    System.out.println("Lahkun");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Asud linnas " + listIterator.next());
                    } else {
                        System.out.println("Jõudsid lõppu");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Asud linnas " + listIterator.previous());
                    } else {
                        System.out.println("Asume esimseses linnas");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }


    private static void printMenu() {
        System.out.println("Vali tegevus\n");
        System.out.println("0-Lahku\n" +
                "1-Edasi\n" +
                "2-Tagasi\n" +
                "3-Näita tegevused");
    }

}

