package tund12.colletions;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Estonia", 8,12);
       // theatre.getSeats();

        if (theatre.reserveSeat("D12")){
            System.out.println("Palun maksa");
        }
        if (theatre.reserveSeat("A05")){
            System.out.println("Palun maksa");
        }
    }
}
