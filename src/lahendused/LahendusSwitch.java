package lahendused;

public class LahendusSwitch {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2001));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(2,1900));

    }

    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 10000) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 10000) {
            return -1;
        }
        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                }
                break;
            default:
                daysInMonth = -1;
                System.out.println("vale väärtus");
                break;
        }
        return daysInMonth;

    }
}
