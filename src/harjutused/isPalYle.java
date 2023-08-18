package harjutused;

public class isPalYle {

    public static void main(String[] args) {
        isPal(1221);
        isPal(1234);
        isPal(-555);


    }
    public static boolean isPal (int arv) {
        int tulemus, sum=0;
        int tArv;
        tulemus=arv;

        while (arv != 0){
           int vNr = arv % 10;
           sum = (sum*10)+vNr;
           arv =arv/10;

        }
        if (tulemus==sum){
            System.out.println(true);
            }
        else {
            System.out.println(false);;
        }
        return arv==tulemus;


    }

}
