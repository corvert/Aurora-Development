package lahendused.bedroom;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(3,"White");

        Bed bed = new Bed(2,1);
        Lamp lamp = new Lamp("Lava");
        Bedroom bedroom = new Bedroom("Juku", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
