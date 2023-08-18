package klassid;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        //kuna model on private väli, siis Main klassist talle otse ligi ei pääse
        //porche.model = "911";
        //System.out.println(porche.model);

        porche.setModel("Carrera");
        System.out.println(porche.getModel());

        Car opel = new Car();
        opel.setModel("Astra");
        System.out.println(opel.getModel());

        porche.makseSound();
        opel.makseSound();
    }

}
