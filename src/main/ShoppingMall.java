package main;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {

    private List<Human> visitors = new ArrayList<>();

    public void addVisitor(Human human){
        this.visitors.add(human);
    }
    @Override
    public String toString(){
        String visitorList = "";
        for(Human human : this.visitors){
            visitorList +=" - " + human.toString();
        }
        return visitorList;
    }
    public void showMari(){
        ((Mari) this.visitors.get(1)).sing();
    }
}
