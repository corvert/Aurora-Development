package forloop;

public class Leapyear {

    /*
       1.
       Teeme meetodi isLeapYear (returnib booleani), sisend int year
       kui year on väiksem kui 1 v suurem kui 9999, siis return false
       kui aasta ei ole liigaasta, return false
       Liigaasta tingimused:
           1) Jagub 4-ga, aga mitte 100-ga
           2) Jagub 400-ga (erand)
       (kui on liigaasta, return true)
       Muuda v kasuta uuesti SwitchNaite failis viimast näidet
       Tee uus meetod, sisend kuu ja aasta
       returnib päevade arvu

     */
    public static void main(String[] args) {

        kuuAasta("Juuni", 1900);

    }

    public static boolean leapYear(int aasta) {
        if (aasta < 1 || aasta > 10000) {
            return false;
        }

        if (aasta % 4 == 0) {
            return true;
        } else if (aasta % 400 == 0) {
            return true;
        } else if (aasta % 100 != 0) {
            return false;
        } else {
            return false;
        }


    }

    static public String kuuAasta(String kuu, int aasta) {
        int daysInMonth;
        if (leapYear(aasta) == true) {


            switch (kuu.toLowerCase()) {
                case "aprill":
                case "juuni":
                case "september":
                case "november":
                    daysInMonth = 30;
                    break;
                case "jaanuar":
                case "märts":
                case "mai":
                case "juuli":
                case "august":
                case "oktoober":
                case "detsember":
                    daysInMonth = 31;
                    break;
                case "veebruar":
                    daysInMonth = 29;
                    break;
                default:
                    daysInMonth = 0;
                    System.out.println("Vale kuu");
                    break;
            }
            System.out.println("Päevi on " + daysInMonth);




        }
        return "vale aasta";
    }
}



