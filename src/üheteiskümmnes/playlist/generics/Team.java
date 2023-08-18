package üheteiskümmnes.playlist.generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;

    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " on juba tiimis");
            return false;
        }
        members.add(player);
        System.out.println(player.getName() + " on tiimis lisatud");
        return true;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public int ranking() {
        return won * 3 + tied;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " võitis vs ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " mängis viiki vs ";
        } else {
            lost++;
            message = " kaotas vs ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return -1;
        } else if (this.ranking()< team.ranking()){
            return 1;
        }
        return 0;
    }
}
