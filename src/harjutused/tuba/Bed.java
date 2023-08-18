package harjutused.tuba;

public class Bed {
    private int billows;
    private int blankets;

    public Bed(int billows, int blankets) {
        this.billows = billows;
        this.blankets = blankets;
    }

    public void isBedMade() {
        System.out.println("Voodi on korras");
    }

    public int getBillows() {
        return billows;
    }

    public int getBlankets() {
        return blankets;
    }
}
