package forloop;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Number 1");
        System.out.println("Number 2");
        System.out.println("Number 3");
        System.out.println("Number 4 ");
        System.out.println("Number 5");

        /*
        For loop koosnueb kolmest osast:
        1) Kood, mis täidetkse tsükli alguses (initseerimine)
        2 Tingimuslause: Senikaua, kuni vastab tõeke, tüskkel käin
        3) kood, m is täidetakse igal tsükli sammul (iteratioonil)
        for(init; tingimus; iteratioon) {}
         */

        for (int i = 0; i < 6; i++) {
            System.out.println("Number " + i);

        }

        System.out.println("1000 2% intressiga on " + calculateInterest(1000, 2));
        //2% kuni 8%
        for (int i = 8; i > 1; i--) {
            System.out.println("10000 " + i + "% intressiga " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interstRate) {
        return amount * (interstRate / 100);
    }
}
