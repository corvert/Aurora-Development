package harjutused.tuba;

public class Lamp {
    private String type;

    public Lamp(String type) {
        this.type = type;
    }
    public void isLampOn () {
        System.out.println("Tuba on valge");
    }

    public String getType() {
        return type;
    }
}
