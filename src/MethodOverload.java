public class MethodOverload {

    public static void main(String[] args) {

        //Meetodi ülelaadimine (overload)
        //meetodid erinevad parameetri tüübi, arvu või järjekorra poolest

        say(5);
        say("Hello");
        say(8, 5.5);
        say(3.1, 4);


    }

    public static void say(int a) {
        System.out.println("Ütlen numbri " + a);
    }

    public static void say(String s) {
        System.out.println(s);
    }

    public static void say(int a, double b) {
        System.out.println("Number " + a + ", komanumber " + b);
    }

    public static void say(double b, int a) {
        System.out.println("Komanumber " + b + " number " + a);
    }
}
