package lahendused.inheritanceharjutus;

public class Volvo extends Car{

    private  int garantiiAeg;

    public Volvo( int garantiiAeg) {
        super("Volvo", "4WD", 5, 5, 6, false);
        this.garantiiAeg = garantiiAeg;
    }
}
