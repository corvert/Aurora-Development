package encapsulation;

public class Player {
    //Halb näide

    public String nimi;
    public int health;
    public String weapon;

    public void loseHealth (int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Mängija on pikali");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
