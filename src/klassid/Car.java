package klassid;

public class Car {

    //klassi väljad (omadused) (field/state)
    // klassiseselt kättesaadavad this.'ga
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //Setter - määrab välja väärtuse
    public void setModel (String model) {

        String validModel = model.toLowerCase();
        if (validModel.equals("panamera") || validModel.equals("astra")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }
    //Getter - tagastab välja väärtuse
    public String getModel(){
        return this.model;
    }
    public void makseSound (){
        System.out.println("wroom wroom");
    }

}
