package tund13.setid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    //set on kaootiline
    //ei saa omada duplikaate
    //.add(), .remove(), .clear(), .size(), .isEmpty(), .contains()
    //setist ei saa spetsiifilist elementi kätte

    //Set ehk hulk on kollektioon või kogum elementidest
    //milles üksi liige ei kordu

    private static Map<String , HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        //lisame Maale kuu
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        //uus planeet
        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //lisame maaa kuu marsile
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);


        //lisame Mars'le sateliidid
        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);



        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moonas of " + body.getName());
        for (HeavenlyBody moon : body.getSatellites()){
            System.out.println("\t" + moon.getName());
        }
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("Kõik kuud");
        for (HeavenlyBody moon : moons){
            System.out.println("\t" + moon.getName());
        }

    }
}
