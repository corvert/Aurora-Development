package lahendused.inheritanceharjutus;

public class Vehicle {
    private String name;
    private String size;

    //kõik sõidukid saavad kiirust ja suunda muuta, Seega need Vehicle klassi

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        //määrame esialgse väärtuse
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Sõiduk sõidab " + direction + " suunas");
    }
    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Sõiduk sõidab kiirusega " + speed + ", suund " + direction);
    }
    public void stop(){
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
