package tund13.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {



    //Colossal Cave Adventure miniversioon
    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"Istume arvuti ees ja õpime Javat"));
        locations.put(1, new Location(1,"Seisad tävana lõpus"));
        locations.put(2, new Location(2,"Seisad mäe otsas"));
        locations.put(3, new Location(3,"Seisad majas sees"));
        locations.put(4, new Location(4,"Seisad jõe ääres"));
        locations.put(5, new Location(5,"Seisad metsas"));

        //loc1
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        //loc2
        locations.get(2).addExit("N", 5);

        //loc 3
        locations.get(3).addExit("W", 1);

        //loc4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        //loc5
        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);


//        String [] splitString = "Istume arvuti ees ja õpime Javat".split(" ");
//        for (String s : splitString){
//            System.out.println(s);
//        }

        //teisendab ühetähalised lauseteks
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Olemasolevad suunad");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }

            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            // juhul kui väiketähed siis .toLowerCase()

            // vocabulary kasutus
            if (direction.length() > 1){
                String[] words = direction.split(" ");
                for (String word : words){
                    if (vocabulary.containsKey(word)){
                        direction = vocabulary.get(word); // word = north(NORTH) -> N("NORTH", "N")
                        //ignoreerime sõnu, mida pole vaja (ja mis on pärast leitud sõna)
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("Sinna ei saa minna");
            }


//            loc = scanner.nextInt();
//            if (!locations.containsKey(loc)){
//                System.out.println("Sinna ei saa minna");
//            }
        }

    }



}
