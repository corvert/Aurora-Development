package harjutused.car;

public class Vehicle {
private int wheels;
private int doors;
private int gears;
private String gearbox;
private int currentGear;
private String name;
private int size;
private int currentSpeed;
private String currentDirection;

    public Vehicle(int wheels, int doors, int gears, String gearbox, int currentGear,
                   String name, int size, int currentSpeed, String currentDirection) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.gearbox = gearbox;
        this.currentGear = currentGear;
        this.name = name;
        this.size = size;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }
}
