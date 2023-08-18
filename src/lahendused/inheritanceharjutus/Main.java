package lahendused.inheritanceharjutus;

public class Main {

    //Vehicle, Can, Auto(Volvo)
    public static void main(String[] args) {
        Volvo volvo = new Volvo(36);
        volvo.steer(45);
        volvo.move(10, volvo.getCurrentDirection());
    }
}
