public class Kordus {
    public static void main(String[] args) {
        //andmetüübid
         int a = 0; //täisarv
        double b = 1.2; // komaga arv
        boolean c = true; //true või false
        String s = "1a2b3c"; //String (eesti k "sõne")

        /*
        +
        -
        *
        /
        % - jääk
         */

        /*
        võrdlused
        == - peab võrduma
        <
        >
        <=
        >=
        != - ei tohi võrduda
         */

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        if (num1<num2) {
            System.out.println("1 on väiksem kui 2");
            if (num2>num3) {
                System.out.println("2 on suurem kui kolm");
            } else {
                System.out.println("2 ei ole suurem kui 3");
            }
        } else {
            System.out.println("1 ei ole väiksem kui 2");
        }
        if (num1 > num2) {
            System.out.println("1 on suurem kui 2");
        } else if (num2 > num1) {
            System.out.println("2 on suurem kui 1");
        } else {
            System.out.println("1 = 2");
        }

        //loogilised sidesõnad
        //&& - ja (mõlemad tingimused peavad olema tõesed
        //|| - või (vähemalt üks tingimus peab vastama tõele)

        /*
        on vaja võrrelda 3 int tüüpi muutujat
        kui üks nendest on < 0, siis prindi "Vale väärtus"
        kui kõik on võrdsed, prindi siis print "Kõik nr-d on võrdsed"
        kui kõik numbrid on erinevad, siis print "kõik nr-d on erinevad"
        muul juhul prindi "pole võrdesd ega erinevad
         */

        int x = 3;
        int y = 1;
        int z = 2;

        if (x<0 || y<0 || z<0){
            System.out.println("Vale väärtus");
        }
        else if (x==y && y==z && x==z){
            System.out.println("Kõik numbird on võrdesed");
        }
        else if (x!=y && y!=z && x!=z) {
            System.out.println("Kõik nr on erinevad");
        } else {
            System.out.println("pole võrdesd ega erinevad");
        }



    }

}
