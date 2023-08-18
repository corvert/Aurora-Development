package tund12.staticfinal;



public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {



        StaticTest firstInstance = new StaticTest("Esimene");
        System.out.println(firstInstance.getName() + " inst. num = " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("Teine");
        System.out.println(secondInstance.getName() + " inst. num = " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("Kolmas");
        System.out.println(thirdInstance.getName() + " inst. num = " + StaticTest.getNumInstances());

        System.out.println(firstInstance.getName() + " inst. num = " + StaticTest.getNumInstances());

        int vastus = multiply(6);
        System.out.println(vastus);

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(three.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(one.getInstanceNumber());

        System.out.println(Math.PI);

        //klass final = ei saa alamklasse luua
        // meetod final = ei saa overwriteda
        //väli( muutuja) final = ei saa väärtust muuta
        //konstruktor private = ei saa instantseerida


        int pw = 123;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(12);
        password.letMeIn(123);

        SIBTest test = new SIBTest();
        test.someMethod();

    }

    public static int multiply (int number){
        return number * multiplier;
    }

}
