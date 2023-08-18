package harjutused.car;

public class SpecCar extends Car{
    private String model;
    private String colour;

    public SpecCar(int wheels, int doors, int gears, String gearbox,
                   int currentGear, String name, int size, int currentSpeed,
                   String currentDirection, String steering, int gearChange, String model, String colour) {
        super(wheels, doors, gears, gearbox, currentGear, name, size, currentSpeed, currentDirection, steering, gearChange);
        this.model = model;
        this.colour = colour;
    }
}
