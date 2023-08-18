package tund12.staticfinal;

public class SIBTest {
            //Static initiallisation block test


    public static final String owner;

    static {
        owner = "Juku";
        System.out.println("SIBTest blokk 1");
    }

    public SIBTest(){
        System.out.println("SIB Konstruktor");
    }
    static {
        System.out.println("SIBtest blokk 2");
    }
    public void someMethod(){
        System.out.println("Mingi meetod");
    }


}
