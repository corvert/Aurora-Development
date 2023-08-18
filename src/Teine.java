public class Teine {
    public static void main(String[] args) {
        /*
        2. harjutus (double)
    Kontrolli, et sisend poleks negatiivne
    tee meetod, mis teisendab km - miilideks
    miil = km / 1,609
    kuva tekst: "X km/h on Y mi/h"
    return miilid
         */
        tulemus(1);
        tulemus(-1);
        tulemus(0);
        tulemus(10);
    }

    public static double tulemus (double km) {
        if (km < 0) {
            return -1;
        }
        double kmMiilides = km * 1.609;
        System.out.println(km +" km/h on " + kmMiilides + " mi/h");
        return kmMiilides;
    }

}
