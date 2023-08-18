package üheteiskümmnes.playlist.generics;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//       // items.add("Juku");
//        items.add(5);
//        printDoubled(items);

        BasketballPlayer martin = new BasketballPlayer("Martin");
        FootballPlayer ragnar = new FootballPlayer("Ragnar");
        TennisPlayer kaia = new TennisPlayer("Kaia");


        Team<FootballPlayer> paide = new Team("Paide linnameeskond");
        paide.addPlayer(ragnar);
//        paide.addPlayer(martin);
//        paide.addPlayer(kaia);

        Team<BasketballPlayer> kalev = new Team<>("Kalev/Cramo");
        kalev.addPlayer(martin);

//        Team<String> brokenTeam = new Team<>("Katkine team"); // <String>'le peab tulema punane joon alla
//        brokenTeam.addPlayer("Mitte keegi");

        System.out.println(paide.numPlayers());


        //Tiime saab teha ainult Player tüüpi klassidega

        Team<FootballPlayer> leavadia = new Team<>("Levadia");
        Team<FootballPlayer> kalju = new Team<>("Kalju");

        paide.matchResult(leavadia, 1,0);
        paide.matchResult(kalju, 4,2);
        leavadia.matchResult(kalju, 2,3);

        System.out.println("Edetabel");
        System.out.println(paide.getName() + " : " + paide.ranking() + " punkit");
        System.out.println(leavadia.getName() + " : " + leavadia.ranking() + " punkit");
        System.out.println(kalju.getName() + " : " + kalju.ranking() + " punkit");

        System.out.println(paide.compareTo(leavadia));
        System.out.println(paide.compareTo(kalju));

        League<Team<FootballPlayer>> preemia = new League<>("Preemia");
        preemia.add(paide);
        preemia.add(leavadia);
        preemia.add(kalju);

        preemia.showTable();


    }

    private static void printDoubled (ArrayList<Integer> n){
        for (int i : n){
            System.out.println(i * 2);
        }
    }
}
