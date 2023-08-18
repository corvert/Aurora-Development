package bankaccount;

public class Main {

    //Teeme pangakonto
    //selle jaoks Account klass
    //väljad
    //konto nr, kontojääk, klinedi nimi ja tel nr
    //kontojääk double, ülejäänud Sting
    // igale väljale getter & setter
    //meetodid, mis lubavad raha sisse panna ja välja võta
    //deposit - sisse, withdraw - välja
    // välja võtmise puhul konrtoll, kas kontojääki on piisvalt
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(500);
        account.setAccNumber("1232235");
        account.setCustName("Juku Jukusson");
        account.setPhone("555 5555");
        account.setEmail("juku@jukusson.ee");




        account.withDraw(600);// peaks ütlema, et pole piisavalt raha
        account.deposit(100);//lisame 100 juurde
        account.withDraw(600);// edukalt raha välja
        System.out.println(account.getBalance()); //peaks olema 0

        Account uusAccount = new Account("122325", 120,
                "Juhan Juhanson", "juhan@mail.ee", "551234");
        System.out.println(uusAccount.getCustName());
        System.out.println(uusAccount.getPhone());
        uusAccount.withDraw(20);

        Account uusKonto = new Account("543322", 10, "Juss");
        uusKonto.withDraw(5);
        System.out.println(uusKonto.getEmail());
    }
}
