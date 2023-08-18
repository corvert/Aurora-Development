package inhertance;

//extends teeb Dog klassist Animali alamklassi
//Animal - ülemklass; Dog - alamklass
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes,
               int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //ülemklassi konstruktor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
private void chew(){
    System.out.println("Dog.chew()");
}
    @Override
    public void eat() {
        System.out.println("Dog.eat()");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move()");
        moveLegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("Dog.run ()");
        //võtab lähima move() meetodi (ehk kas sama klass või ülemklass
        move(10);
    }
    public void walk (){
        System.out.println("Dog.walk()");
        //super.move() võtab move() meetodi ülemklassist
        //sõltumata sellest, kas samas klassis move() on olemas
        super.move(5);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs () kiirusega " + speed);
    }
}
