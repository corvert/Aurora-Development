package main;

public class Main {
    public static void main(String[] args) {

        Juhan juhan = new Juhan(150, 80);
        Mari mari = new Mari(200,70);
        ShoppingMall sm = new ShoppingMall();

        PerfectChef Kalle = new Juhan(20,20);

        mari.eat();
        mari.sing();
        juhan.eat("banaan");
        sm.addVisitor(juhan);
        sm.addVisitor(mari);
        juhan.useRoller();
        juhan.eat();

        System.out.println(sm.toString());

        sm.showMari();

    }
}
