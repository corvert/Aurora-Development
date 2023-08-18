package lahendused;

public class Esimene {
    //1. Harjutus (void)
    //Tee meetod (sisend int), mis ütleb kas number on pos, neg või null
    public static void main(String[] args) {
        posNegZero(-1);
        posNegZero(0);
        posNegZero(1);

    }
    public static void posNegZero(int number){
        if(number>0) {
            System.out.println("Number on postiivne");
        } else if (number<0) {
            System.out.println("Number on negatiine");
        } else {
            System.out.println("Number on 0");
        }
    }
}
