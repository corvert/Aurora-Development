package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//massiiv

    public static void main(String[] args) {
        int myVariable = 10;
        int [] myArray = new int[10];
        //kuna väärtuseid ei täpsusta, siis vaikimisi väärtused 0'd
        //Massiiv suurusega 10
        //Indeksid: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        System.out.println(myArray[9]);

        double[] doubles = new double[5];
        String[] strings = new String[3];

        System.out.println(doubles[1]);
        System.out.println(strings[2]);

        int[] newIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(newIntArray[0]);
        System.out.println(newIntArray[5]);
        System.out.println(newIntArray[9]);
        //System.out.println(newIntArray[10]);

        myArray[5] = 50;
        myArray[2] = 20;

        //printArray(myArray);
        int[] forIntArray = new int[25];
        for (int i=0; i< forIntArray.length; i++){
            forIntArray[i] = i*10;
        }
        printArray(forIntArray);
        System.out.println(getAverage(forIntArray));

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
        System.out.println("Keskimine väärtus " + getAverage(myIntegers));





    }

    public static  int[] getIntegers (int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta " + number + " täisarvu");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", väärtus = " + array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];

        }
        return (double) sum / (double) array.length;
    }

    public static int [] sortIntegers (int[] array){
         int[] sortedArray = new int[array.length];
         for (int i=0; i< array.length; i++){
             sortedArray[i] = array[i]; //hetkel on sortedArray koopia sisendarrayst
         }

         int[] newSortedArray = Arrays.copyOf(array, array.length);
         //teeb sama asja, kopeerib array

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[i+1];
                   sortedArray[i+1]=temp;
                   flag=true;
                }
            }
        }
        return sortedArray;

    }

}
