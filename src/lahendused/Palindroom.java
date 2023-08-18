package lahendused;

public class Palindroom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1133));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;
        int tempNum = number;
        while (tempNum!=0) {
            System.out.println("Number = " + tempNum);
             lastDigit = tempNum % 10;
            System.out.println("Last digit = " + lastDigit);
             reverse *= 10;
            System.out.println("Reverse = " + reverse);
             reverse += lastDigit;
            System.out.println("New reverse = " + reverse);
             tempNum /= 10;
            System.out.println("New number = " + tempNum);
            System.out.println("*************");

        }

        System.out.println("-----------------");
        return number==reverse;
    }

}
