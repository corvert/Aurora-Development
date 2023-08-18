package lahendused;

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
        kmToMil(-1);
        kmToMil(3.2);
    }
    public static double kmToMil (double kilometers){
        if (kilometers<0) {
            return -1;
        }
        double miles = kilometers/1.609;
        System.out.println(kilometers + " km/h on "+ miles + " mi/h");
        return miles;
    }
}
