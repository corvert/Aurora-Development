package Switchnäide;

public class Switchnaide {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1){
            System.out.println("Väärtus on 1");
        } else if (value==2) {
            System.out.println("Väärtus on 2");
        } else {
            System.out.println("Pole 1 ega 2");
        }

        int switchValue =3;
        switch (switchValue){
            case 1:
                System.out.println("Switch väärtus = 1");
                break;
            case 2:
                System.out.println("Switch väärus = 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Switch oli 3, 4 või 5");
                break;
            default:
                System.out.println("Switch pole 1 ega 2");
                break;  //default puhul pole vaja.
        }

        char switchChar ='D';
        //a puhul prindab "oli A"
        // B puhul prindib "oli B
        //C, D, E puhul pindib "Oli C,D või E"
        //muul juhul prindib "Ei letidu"
        switch (switchChar) {
            case 'A':
                System.out.println("oli A");
                break;
            case 'B':
                System.out.println("Oli B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("oli C,D või E");
                break;
            default:
                System.out.println("Ei leitud");
                break;
        }

        String kuu = "jUuli";
        switch (kuu.toLowerCase()) {
            case "jaanuar":
                System.out.println("Jan");
                break;
            case "juuli":
                System.out.println("Jul");
                break;
            default:
                System.out.println("pol kindel");
                break;
        }
        int month, daysInMonth; //muutujatele ei pea andma väärust kui sama andmetüüp, saab teha mitu tükki eraldades komaga
        month = 2;
        switch (month) {
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                daysInMonth = 0;
                System.out.println("vale väärtus");
                break;
        }
        System.out.println("Päevi on " + daysInMonth);

    }
}
