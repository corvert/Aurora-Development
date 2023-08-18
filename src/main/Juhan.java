package main;

public class Juhan extends Human implements PerfectChef{

    public Juhan(int height, int weight){
        super(height,weight);
    }
    @Override
    public void eat(){
        System.out.println("Juhan does not eat");
    }

    @Override
    public void walkWithStyle() {

    }

    public void eat(String food){
        System.out.println("eating " + food);
    }

    @Override
    public void useRoller() {

    }

    @Override
    public void notBurnFood() {

    }
}
