package tund13.exceptionid;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

       // System.out.println(x/y);

        //LBYL - Look Before You Leap
        System.out.println(divideLBYL(x,y));

        //EAFP - Easier to Ask Forgiveness than Premission
        System.out.println(divideEAFP(x,y));

        int z = getIntLBYL2();
        System.out.println("z on " + z);


    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Sisesta int");
        return s.nextInt();
    }

    private static int getIntLBYL2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Siseta int:");

        if (s.hasNextInt()){
            return s.nextInt();
        }
        return 0;
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;

        System.out.println("Palun sisesta int:");
        String input = s.next(); //as3d

        for (int i = 0; i<input.length(); i++){
            //as3d = ['a', 's', '3', 'd']
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }

        }
        if (isValid){
            return Integer.parseInt(input);
        }
        return 0;

    }

    private static int divideLBYL (int x, int y){
        if (y != 0){
            return x/y;
        } else { // y == 0
            System.out.println("0-ga ei saa jagada");
            return 0;
        }


    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("palun sisesta int:");
        try {
            return s.nextInt();
        }catch (InputMismatchException e) {
            return 0;
        }
    }
    private static int divideEAFP (int x, int y){
        //toimetab sõltumata selles, kas 0 või mitte.
        //kui on 0, siis catchib exceptioni
        try {
            return x/y;
        } catch (ArithmeticException e) {
            System.out.println("0'ga ei saa jagada");
            return 0;
        }
    }

}
