package boxingunboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //primitiivne tüüp - int double boolean char
        //Integer, Double, Boolean, Character (wrapper klassid)

        int a = 5;
        Integer b = 2;

        Integer e = Integer.valueOf(5); //see mis taustal toimub
        // valueOf teeb int tüübi Integeriks
        //autoboxing = viime prim tüübist wrapper klassi

        int f = e.intValue();
        //intValue teeb Integeri int-ks
        //unboxing - viime wrapper klassist primitiivsesse int tüüpi

        ArrayList<Double> abc;

    }
}
