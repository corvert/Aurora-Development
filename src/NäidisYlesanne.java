public class NäidisYlesanne {

    public static void main(String[] args) {
     calcCentimeteres(1000);
     calcCentimeteres(101,9);
    }

    public static double calcCentimeteres(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " jalga ja " + inches + " tolli on " + centimeters + " cm");
        return centimeters;
    }
    public static double calcCentimeteres(double inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = ((int) inches) / 12;
        double remainingInches = inches % 12;
        return calcCentimeteres(feet, remainingInches);
        }
}
