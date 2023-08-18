package tund12.colletions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String threatreName; // final - enam muuta ei saa
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String threatreName, int numRows, int seatsPerRow) {
        this.threatreName = threatreName;

        int lastRow = 'A' + (numRows - 1); // võetakse A ASCII kood
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));// kuidas ja mida formatime kahekohaliseks
                seats.add(seat);

            }
        }
    }

    public String getThreatreName() {
        return threatreName;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber) {

        //Parem lahendus väljakirjutatud

      int low = 0;
      int high = seats.size() -1;

      while (low<=high){
          System.out.print(".");
          int mid = (low + high) / 2;
          Seat midVal = seats.get(mid);
          int cmp = midVal.getSeatNumber().compareTo(seatNumber);

          if (cmp < 0){
              low = mid +1;
          } else if (cmp > 0) {
              high = mid -1;
          } else {
              return seats.get(mid).reserve();
          }
      }
        System.out.println("Sellist istet ei ole");
      return false;


            //TEINE (PAREM) LAHENDUS
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if (foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("Sellist istet ei olemas");
//            return false;
//        }

        //ESIMENE LAHENDUS
//        Seat requestedSeat = null;
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("Sellist istet ei ole");
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false; // kas on bronnitud

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
        public boolean reserve (){
            if (reserved){
                System.out.println("Iste juba reserveeritud");
                return false;
            }
            reserved = true;
            System.out.println("Iste " + seatNumber + " reserveertidu");
            return true;
        }
        public boolean cancel(){
            if (!reserved){
                System.out.println("Viga tühistamsiel");
                return false;
            }
            reserved = false;
            System.out.println("Reserveering tühistatud");
            return true;
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
