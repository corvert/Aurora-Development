package whileloop;

public class WhileLoop {

    public static void main(String[] args) {
        //while loop töötab ainult siis kui tingimus on täidetud
        int count = 0;
        while (count < 5) {
            System.out.println("Count = " + count);
            count++;
        }
        // for loopi analoog
        for (int i=0; i<5; i++) {
            System.out.println("For count = " + i);
        }
        count = 0;
        while (true){
            if (count== 5) {
                break;
            }
            System.out.println("Count = " + count);
            count++;
        }

        int number = 4;
        int finishNumber = 20;

        int numberFound = 0;

        while (number<finishNumber){
            number++;
            if (!isEvenNumber(number)){
                System.out.println("Paaritu arv " + number);
                continue;
            }
            System.out.println("Paaris arv " + number);
            numberFound++;
            if (numberFound>= 5){
                break;
            }
        }

    }

    public static boolean isEvenNumber (int number){
        return number % 2 == 0;
    }

}
