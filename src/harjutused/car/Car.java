package harjutused.car;

public class Car extends Vehicle {
    private String steering;
    private int gearChange;

    public Car(int wheels, int doors, int gears, String gearbox,
               int currentGear, String name, int size, int currentSpeed,
               String currentDirection, String steering, int gearChange) {
        super(wheels, doors, gears, gearbox, currentGear, name, size, currentSpeed, currentDirection);
        this.steering = steering;
        this.gearChange = gearChange;
    }
}
