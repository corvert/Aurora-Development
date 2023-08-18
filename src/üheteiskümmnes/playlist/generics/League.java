package üheteiskümmnes.playlist.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Team> {

    private String name;
    private List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;

    }

    public boolean add(T team){
        if (league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showTable(){
        Collections.sort(league);
        for (T t : league){ // enhanced for looad / for each
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}
