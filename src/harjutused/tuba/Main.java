package harjutused.tuba;

public class Main {
    public static void main(String[] args) {
        Room room = new Room (4,new Ceiling(2,"valge"), new Bed(4,1),new Lamp("laua"));
        Bed bed = new Bed(4,1);
        Lamp lamp = new Lamp("laua");
        lamp.isLampOn();
        bed.isBedMade();
        room.wallDirectios("ida");

        room.getBed().isBedMade();



    }
}
