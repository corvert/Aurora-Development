package interfacenaide;
//04.01.2023

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //imiteerime andmete kirjutamist ja lugemist
    //Mäng, kus on mängija ja koletis

    public static void main(String[] args) {
        Player player = new Player("Juku",10,15);
        System.out.println(player);//player.toString()
        saveObject(player);
        //loadObject(player);
        player.setHitPoints(8);
        System.out.println(player);

        Saveable wereWolf = new Monster("libahunt", 20,40);
        //wereWolf = new Player("uus mängija",1,2);
        System.out.println(wereWolf);
        saveObject(wereWolf);
        loadObject(wereWolf);
        System.out.println(wereWolf);
        System.out.println(player.getStrength());
        System.out.println(((Monster) wereWolf).getStrength());


         double myBouble = 5.6;
        System.out.println((int) myBouble);
    }

    public static void saveObject(Saveable objectToSave){
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Salvestame " + objectToSave.write().get(i) + " kuskile mällu");
        }
    }
    public static void loadObject (Saveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }
    public static List<String> readValues(){
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("""
                Vali:
                0, et väljuda
                1, et sisestada andmeid
                """);
        while (!quit){
            System.out.println("Tee valik");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Sisesta String");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }
        }
        return values;
    }

}
