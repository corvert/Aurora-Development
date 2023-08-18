public class Hello {

    public static void main(String[] args) { // lühend psvm
        System.out.println("Hello world"); // lüh sout
        System.out.println("Hello Orvet");
        int esimeneNumber = (10+5)*2;
        //andmetüüp muutjanimi = väärtus
        System.out.println(esimeneNumber);
        int teineNumber = 12;
        System.out.println(teineNumber);
        int kolmasNumber = 6;
        System.out.println("kolmasNumber");
        System.out.println(esimeneNumber + " " + teineNumber + " " + kolmasNumber);


        System.out.println(1000 - (esimeneNumber + teineNumber + kolmasNumber));
        int summa = esimeneNumber + teineNumber + kolmasNumber;
        int vahe = 1000 - summa;
        System.out.println(vahe);
    }
}
