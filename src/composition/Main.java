package composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("1232B","Dell","240", dimensions);

        Monitor theMonitor = new Monitor("ABC1234", "BENQ",
                24, new Resolution(1920,1080));

        Motherboard theMotherboard = new Motherboard("ASD-123",
                "ASUS", 4,6,"v4.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        //thePC.getTheCase().pressPowerButton();
        //thePC.getMotherboard().loadProgram("Windows");
        //thePC.getMonitor().drawPixelAt(900,600,"punane");

        //System.out.println(thePC.getMonitor().getNativeResolution().getHeight());

        thePC.powerUp();

    }

}
