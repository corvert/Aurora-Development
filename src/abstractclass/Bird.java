package abstractclass;

import javax.sound.midi.Soundbank;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " nokkib");

    }

    @Override
    public void breathe() {
        System.out.println(getName() + " hingab");

    }
    public void fly(){
        System.out.println(getName() + " Vehib tiibadega");
    }
}
