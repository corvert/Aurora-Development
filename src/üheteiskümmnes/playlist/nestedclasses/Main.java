package üheteiskümmnes.playlist.nestedclasses;

public class Main {

    public static void main(String[] args) {
        Gearbox volvo = new Gearbox(6);
       // Gearbox.Gear first = new Gearbox.Gear(3,2); // static klassi puhul peaks toimima
        //Gearbox.Gear second = new volvo.Gear(3,5);

       // Gearbox.Gear third = volvo.new Gear (2,2);
        //System.out.println(third.driverSpeed(1000));

        volvo.operateClutch(true);
        volvo.changeGear(1);
        volvo.operateClutch(false);
        System.out.println(volvo.wheelSpeed(1000));
        volvo.changeGear(2);
        System.out.println(volvo.wheelSpeed(3000));
        volvo.operateClutch(true);
        volvo.changeGear(6);
        volvo.operateClutch(false);
        System.out.println(volvo.wheelSpeed(6000));

        intPrint();

    }

    public static void intPrint (){
        //Klasse saab teha ka meetodite sisse
        class MyClass {
            int myInt = 5;
            void printInt(){
                System.out.println(myInt);
            }
        }
        MyClass myClass = new MyClass();
        myClass.printInt();
    }

}
