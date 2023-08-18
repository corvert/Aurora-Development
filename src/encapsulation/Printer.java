package encapsulation;

public class Printer {

    //Simuleerib päris printerit

    private int toner;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {

        if (toner >= 0 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1; // -1 tavalislt error int kujul
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;

    }

    public int addToner(int amount) {
        /*if (amount <= 0 && amount > 100){
            System.out.println("Vale väärtus");
            return -1;
        }*/
        if (amount > 0 && amount <= 100) {
            if (this.toner + amount > 100) {
                System.out.println("Olemasolev kogus + lisatav kodus on üle 100");
                return -1;
            } else {
                this.toner += amount;
                return this.toner;
            }

        } else {
            System.out.println("Lisatud tint <0 või > 100");
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages; // paber vs lehekülg

        if (isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);

        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;


    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
