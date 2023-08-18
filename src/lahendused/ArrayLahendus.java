package lahendused;

import java.util.Arrays;

public class ArrayLahendus {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("Array = " + Arrays.toString(array));
        //1,2,3,4
        reverse(array);
        System.out.println("Reversed = " + Arrays.toString(array));
    }
    private static void reverse(int[] array){
        //Pöörame siin array ümber
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;

        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            System.out.println("Asendati " + temp + " " + array[maxIndex-i] + "-ga");
            array[maxIndex-1] = temp;
        }
    }
}
