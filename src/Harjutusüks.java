public class Harjutusüks {

    public static void main(String[] args) {
        //1. Harjutus (void)
        //Tee meetod (sisend int), mis ütleb kas number on pos, neg või null
        number(3);
        number(2);
        number(-1);
        number (0);
        number (6);
        number (-7);
    }

    public static void number(int arv) {
        if (arv > 0) {

            System.out.println("Number " + arv + " on positiivne");

        } else if (arv < 0) {
            System.out.println("Number on " + arv + " negatiivne");
        } else {
            System.out.println("Number  on null");
        }
    }
}

