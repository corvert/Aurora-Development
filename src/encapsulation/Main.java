package encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.nimi = "Juku";
        player.health = 20;
        player.weapon = "Mõõk";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Elusid alles " + player.healthRemaining());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Elusid alles " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Juhan",50,"kaigas");
        enhancedPlayer.loseHealth(25);
        System.out.println("Elud: " + enhancedPlayer.getHealth());

        //printer

        Printer printer = new Printer(50, true);
        System.out.println("Esialgne prinditud lehte arve: " + printer.getPagesPrinted());

        int pagesPrinted = printer.print(4);
        System.out.println("Prinditi " + pagesPrinted + " lehte, uus koguarv on " + printer.getPagesPrinted());

        pagesPrinted = printer.print(5);
        System.out.println("Prinditi " + pagesPrinted + " lehte, uus koguarv on " + printer.getPagesPrinted());

        printer.addToner(25);
    }

}
