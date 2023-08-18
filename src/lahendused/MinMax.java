package lahendused;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // üks lahenuds kasutades int min ja max väärtuseid
        //int min = Integer.MAX_VALUE;
        //int max = Integer.MIN_VALUE;

        //teine lahendus kasutades booleani esimese nr jaoks
        boolean first = true;
        int min=0;
        int max=0;

        while (true){

            System.out.println("Sisesta number:");
            boolean isInt = scanner.hasNextInt();

             if (isInt){
                 int number = scanner.nextInt();
                 // first ainult
                 if (first){
                     first = false;
                     min = number;
                     max = number;
                 }
                 if (number>max){
                     max = number;
                 }
                 if (number<min){
                     min = number;
                 }
             }else {
                 break;
             }
             scanner.nextLine();
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
        scanner.close();
    }
}
