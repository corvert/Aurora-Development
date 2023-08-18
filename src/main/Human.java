package main;

public abstract class Human {

    public int height;
    protected int weight;
    private String thought;

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public  Human(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eat something");
    }

    public abstract void walkWithStyle();
}
