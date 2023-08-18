package lahendused.inheritanceharjutus;

public class Car extends Vehicle{

    private  int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;

        this.currentGear = 1;
    }

    public void changeGear (int newGear){
        this.currentGear = newGear;
        System.out.println("Auto käik = " + newGear);

    }

    public void changeSpeed (int speed, int direction){
        move(speed, direction);
        System.out.println("Auto kiirus: " + speed + ", suund: " + direction);
    }

}
