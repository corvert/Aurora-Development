package forloop;

public class Fizzbuzz {
    public static void main(String[] args) {
        // prindi numbrid 1-100
        // kõik nr-d mis jaguvad 3-ga, prindi nr asemel "Fizz"
        // kõik nr-d mis jaguvad 5-ga prindi nr asemel "Buzz"
        // kõik nr mis javuvad 3 ja 5ga prindi nr asemele "FizzBuzz"

        for (int i=1; i < 101; i++){
            if (i % 3 == 0 && i % 5 == 0) { //kitsamad tingimused ette
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) { //laiemad tigimused alla
                System.out.println("Buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
