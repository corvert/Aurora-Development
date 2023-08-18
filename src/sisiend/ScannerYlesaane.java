package sisiend;

import java.util.Scanner;

public class ScannerYlesaane {

    public static void main(String[] args) {
        //Loe kasutjalt 10 nr-t ja liida kokku
        //Kasuta hasNextInt() meetodit, et kontrollida kasutaja sisendit
        //Kui on fase, prindime "Vale väärtus"
        // ja jätkame lugemist kuni on leitud 10 nr-t
        // nr saame kätte nextInt()-ga, liidame summasse
        //Enne, kui kasutaja sisestab nr-i printi "Sisesta number #x:"
        // kus x on loendus (1,2,3 jne)


        Scanner scanner = new Scanner(System.in);

        int counter = 0; // peab arvet mitu numberit on
        int sum = 0; // leitud arvude summa

        while (counter < 10) {
            System.out.println("Sisesta number #" + (counter + 1) + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
               // scanner.nextLine();
                counter++;
                sum += number;
            } else {
                System.out.println("Vale väärtus");
                //scanner.nextLine();
            }
            scanner.nextLine();

        }
        System.out.println("Numbrite summa: " + sum);

        scanner.close();

    }
}
