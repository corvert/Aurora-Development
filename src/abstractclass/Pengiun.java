package abstractclass;

import javax.sound.midi.Soundbank;

public class Pengiun extends Bird{

    public Pengiun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " ujub");
    }
}
