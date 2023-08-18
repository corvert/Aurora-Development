public class Operators {

    //psvm lühend
    public static void main(String[] args) {
        int result = 1 + 2; // liitmine  1+2 = 3
        System.out.println(result);

        result = result - 1; // 3 - 1 = 2 lahutmine
        // vasakul muutja nimi
        // paremal muutuja väärtus
        //kasutades sama muutujat, võtab selle väärtuse, mis tal parasjagu on
        System.out.println(result);
        result = result * 10; // 2*10 = 20 kurrtamine
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4 jagamine
        System.out.println(result);

        result = result % 3; // 4 % 3 = 1 jääk
        // ntx 5%3 = 2 (2 jääb üle)
        System.out.println(result);

        result++; //liidab ühe (1+1=2)
        System.out.println(result);

        result--; //lahutab ühe (2-1=1)
        System.out.println(result);

        result += 2; //result = result +2 (1+2=3)
        System.out.println(result);

        result *= 10; //result = result * 10 (3x10 = 30
        System.out.println(result);

        result /= 3; // result = result / 3 (30/3 = 10)
        System.out.println(result);

        result -= 2; // result = result -2 (10 - 2 = 8)
        System.out.println(result);

        //andmetüübid
        // int (integer täisarv),
        // double (tõeväärtus),
        // boolen (tõeväärtus)
        // kolm põhilist
        // char (üks tähemärk) ja long (täisarv)

        boolean isAlien = false; //alternatiiv false

        if (isAlien == true) {
            // 2 võrdust - sisulislt matemaatline võrdus
            System.out.println("See on tulnukas");
        }
        int topScore = 90;
        if (topScore == 100) {
            System.out.println("Sa said parima skoori");
        }
        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Sinu skoor on parem kui teine");
        }
        if (topScore > 90 || secondTopScore < 90) {
            System.out.println("Üks või mõlemad on tõesed");
        }

        //&& - ja (mõlemad tingiumsed peavad olema täidetud)
        //|| - või (vähemalt üks tingimus peab olema täidetud)
        // võib olla mitu tingimist

        boolean isCar = false;
        if (isCar) { //sama, mis isCar == true
            System.out.println("See on auto");
        }
        if (!isCar) { //! sama, mis isCar == false
            System.out.println("See ei ole auto");

        }

        //võrdlused
        //== (peab olema võrdne)
        //> (suurem)
        //< (väiksem)
        //>= (suurem võrdne)
        //<= (väiksem-võrdne)
        // != (ei tohi võrduda)

        double myDouble = 6.5; //double on komakohaga arv
        System.out.println(myDouble + result);

        double nael = 0.45;
        int mituNaela = 3;
        System.out.println(mituNaela +  " naela on " +  mituNaela * nael + " kilo");

        double esimene = 20;
        double teine = 80;
        double vaheSum = esimene + teine;
        double sum = vaheSum * 100;
        double jääk = sum % 40;
        System.out.println(jääk);

        if (jääk > 0) {
            System.out.println("Jääki jäi üle");
        } else  {
            System.out.println("Jääki ei olnud");
        }

        if (esimene < teine) {
            System.out.println("Esimene on väiksem");
            if (esimene % 10 == 0) {
                System.out.println("Esimene jagub 10-ga");
            } else {
                System.out.println("Esimene ei jagu 10'ga");
            }
        } else if (teine < esimene) {
            System.out.println("Teine on väiksem");
        } else {
            System.out.println("Esimeine ja teine on võrdesed");
        }



    }

}
