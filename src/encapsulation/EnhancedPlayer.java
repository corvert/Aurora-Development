package encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //valideerimine
        if (health>0 && health<=100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth (int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Enhanced mängija on pikali");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
