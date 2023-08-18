package harjutused.tuba;

public class Room {

    private int walls;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;


    public Room(int walls, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }



    public void wallDirectios (String arcOfWather){
        System.out.println("Sein on " + arcOfWather + " suunaline");
    }

    public int getWalls() {
        return walls;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
