public class Harjutused {

    public static void main(String[] args) {

        getDuration(301, 5);
        getDuration(59, 5);
        getDuration(3963);
    }

    public static int getDuration(int min, int sek) {
        if (min < 0 || sek < 0 || sek > 59) {
            System.out.println("Vale väärtus");
            return -1;
        }
        int tunnid = min / 60;
        int minutid = min % 60;
        if (tunnid < 10 && minutid >= 10 && sek >= 10) {
            System.out.println("0" + tunnid + " h " + minutid + " m " + sek + " s");
            return -1;

        } else if (tunnid < 10 && minutid < 10 && sek >= 10) {
            System.out.println("0" + tunnid + " h 0" + minutid + " m " + sek + " s");
        } else if (tunnid < 10 && minutid < 10 && sek < 10) {
            System.out.println("0" + tunnid + " h 0" + minutid + " m 0" + sek + " s");
        } else if (tunnid >= 10 && minutid < 10 && sek < 10) {
            System.out.println("" + tunnid + " h 0" + minutid + " m 0" + sek + " s");
        } else if (tunnid < 10 && minutid >= 10 && sek < 10) {
            System.out.println("0" + tunnid + " h " + minutid + " m 0" + sek + " s");

        } else {
            System.out.println(tunnid + " h " + minutid + " m " + sek + " s");
            return -1;
        }
        return -1;
    }


    public static int getDuration(int sek) {
        if (sek < 0) {
            System.out.println("Vale väärtus");
            return -1;
        }
        int tunnid = sek / 3600;
        int hjääk = sek / 60;
        int minutid = hjääk % 60;
        int sekundid = sek % 60;
        if (tunnid < 10) {
            System.out.println("0" + tunnid + " h " + minutid + " m " + sekundid + " s");
            return -1;
        } else {
            System.out.println(tunnid + " h " + minutid + " m " + sekundid + " s");
            return -1;
        }

    }
}


