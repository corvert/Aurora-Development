package harjutused;

import java.util.Scanner;


public class ScannerYlesanne {

    public static void main(String[] args) {
        int min, max;
        System.out.println("Sisesta number: ");

        Scanner scanner = new Scanner(System.in);


        int tulemus = scanner.nextInt();
        boolean onArv = scanner.hasNextInt();

        min = max = tulemus;


        while (onArv) {
            if (!scanner.hasNextInt())
                break;
            System.out.println("Sisesta number: ");
            tulemus = scanner.nextInt();
            if (tulemus < min) {
                min = tulemus;
            }
            if (tulemus > max) {
                max = tulemus;
            }




        }
        System.out.println("Max on " + max + " min on " + min);
        scanner.close();
    }
}
