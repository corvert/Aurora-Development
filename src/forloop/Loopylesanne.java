package forloop;

public class Loopylesanne {
    /*2.
    Tee for loop, mille vahemik on 1-1000
    Liida kõik numbrid, mis jaguvad 3 ja 5-ga (&&)
    Printi kõik numbrid, mis seda tingimust täidavad
        break-i loopist välja, kui on leitud 5 numbrit
    pärast break'i, printi numbrite summa, mis seda tingimust täitsid

            //break näide loopis
            */


    public static void main(String[] args) {
        int sum = 0, kokku = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {

                if (i == 75)
                    break;
                sum += i;
                System.out.println(i);
            }


        }
        System.out.println("Summa " + sum);

    }
}


