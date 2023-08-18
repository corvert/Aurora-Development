package banking;

public class Main {

    //Lihtne pangahaldusprogramm
    //Bank
    //ArrayList Branch kohta
    //nimi
    //Saab lisada uue haru, kliendi harusse
    //Näeb kliente (ja valikulislt kliendite tehinguid)
    //Saab lisada klientidele tehinguid

    //Branch
    //ArrayList Customer kohta
    //nimi
    //Saab lisada kliente koos esimese tehinguga
    //Saab lisada tehinguid

    //Customer
    //Tehingud Arraylistis (Double)
    //nimi
    //Saab lisada tehinguid

    public static void main(String[] args) {
        Bank bank = new Bank("Juku pank");
        bank.addBranch("Tallinn");
        bank.addBranch("Tartu");

        bank.addCustomer("Tallinn", "Juku", 50);
        bank.addCustomer("Tallinn", "Juhan", 100);
        bank.addCustomer("Tallinn", "Malle", 200);

        bank.addCustomer("Tartu", "Maie", 300);

        bank.addCustomerTransaction("Tallinn", "Juku", 20);
        bank.addCustomerTransaction("Tallinn", "Juku", 70);
        bank.addCustomerTransaction("Tallinn", "Juku", 20);

        bank.listCustomers("Tallinn", true);
        bank.listCustomers("Tartu", true);
    }

}
