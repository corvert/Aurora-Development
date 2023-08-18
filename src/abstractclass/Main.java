package abstractclass;
//04.01.2023
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Puudel");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Papagoi");
        bird.fly();
        bird.breathe();
        bird.eat();

        Pengiun pengiun = new Pengiun("Pingviin");
        pengiun.fly();

    }
}
