package abstractclass;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Närib");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " hingelab");

    }
}
