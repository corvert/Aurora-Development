package inhertance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("loom", 1,1,1,1);
        animal.eat();
        animal.move(10);

        Dog dog = new Dog("puudel", 10,2,2,4,1,12,"karvane");

        System.out.println();
        dog.eat();
        System.out.println();
        dog.move(7);
        System.out.println();
        dog.run();
        System.out.println();
        dog.walk();
        System.out.println();

        Fish fish=new Fish("Heerings", 2,1,2,2,4);
        fish.swim(3);
        fish.eat();
    }

}
