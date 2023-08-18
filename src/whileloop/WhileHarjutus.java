package whileloop;

public class WhileHarjutus {
    //leiame arvu ristsumma
    //125 = 1 + 2 + 5 = 8
    // esialgne arve ei tohi olla alla 10ne

    public static void main(String[] args) {
        System.out.println(sumDigits(125));

    }

    public static int sumDigits(int number){

        if (number < 10){
            return -1;
        }
        // ristsumma leidmise loogika
        int sum =0;
        while (number > 0){
            //125 % 10 = 5 (kuna 10 mahud 12 korda, 5 jjäb üle)
            System.out.println("pregune number "+ number);
            int digit = number % 10;
            // liidame numberi sum-i
            System.out.println("liidetud number " + digit);
            sum += digit;
            System.out.println("vahesumma " + sum);
            //eemaldame ühelised

            number /= 10;
            System.out.println("uus number" + number);
            System.out.println("----------------------");

        }
        return sum;
    }

}
