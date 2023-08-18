package interfaced;

public class Main {
    public static void main(String[] args) {
        Telephone jukuPhone;
        jukuPhone = new DeskPhone(123);
        jukuPhone.powerOn();
        jukuPhone.callPhone(123);
        jukuPhone.answer();


        jukuPhone = new MobilePhone(321);
        jukuPhone.powerOn();
        jukuPhone.callPhone(321);
        jukuPhone.answer();

        //Meetod toimim ainult juhul, kui castime
        ((MobilePhone)jukuPhone).sendSMS();
    }
    /*
    ülemklassi ja interface vahe
    is (miski on midagi) vs has (miskil on mingi võimekus)
    nt linnu klass
    class Bird extends Animal implements Walk, Fly
    class Dog extends Animal implements Walk
     */


}
