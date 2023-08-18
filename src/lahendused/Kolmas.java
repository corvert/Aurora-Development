package lahendused;

public class Kolmas {
    public static void main(String[] args) {
    /*
        3. harjutus (String)
        Tee meetod nimega getDuration
        esimene sisend: minutid; teine sisend sekundid (soovitatav int)
        kontrolli, et minutid oleks   minutid >= 0
        kontorlli, et sekundid oleks >= ja <= 59
        return "Vale väärtus", kui kumbki neist tingimistst pole täidetud

        returni String kujul XXh YYm ZZs
        kus XX on tunnid, YY mintud ja ZZ sekundid
        (nt 10h 36m 15s)

        tee teine sama nimega meetod, kus sisendiks on ainulat sekundid
        kontr, et sisend oleks >= 0
        kUI MITTE, SIIS RETURNI "Vale väärtus"

        Pärast kontrolli kasuta esimist meetodid, et arvutaka tunnid, min, sek
        1m = 60 s
        1h = 60 m; 3600 s

                Boonus
        Kui on ühekonrde number (0-9), kuva 0 nr ette
        nt 1h 0 m 8S -> 01h 00m 08S
*/
        System.out.println(getDuration(66,59));
        System.out.println(getDuration(3666));

    }

    public static String getDuration (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Vale väärtus";
        }
        int hours = minutes / 60; // leiame tunnid
        int reminingMinutes = minutes % 60; // ülejäänud mintuid

//        String hourString = hours + "h";
//        if (hours<10) {
//            hourString = "0" + hourString;
//        }
//        String minuteString = reminingMinutes + "m";
//        if (reminingMinutes<10) {
//            minuteString = "0" + minuteString;
//        }
//        String secondString = seconds + "s";
//        if (seconds<10) {
//            secondString = "0" + secondString;
//        }
        String hourString = convertString(hours, "h");
        String minuteString = convertString(reminingMinutes, "m");
        String secondString = convertString(seconds,"s");

        //return hours + "h " + reminingMinutes + "m " + seconds + "s";
        return hourString + " " + minuteString + " " + secondString +" ";
    }
    public static String getDuration (int seconds) {
        if (seconds<0){
            return "Vale väärtus";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return (getDuration(minutes, remainingSeconds));
    }

    // meetod nullide tegemiseks
    public static String convertString (int number, String letter) {
        String numberString = number + letter;
        if (number<10) {
            numberString = "0" + numberString;
        }
        return numberString;
    }

}
