package interfaced;

public class MobilePhone implements Telephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobiil on sisse lülitatud");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Helistab " + phoneNumber + "-le mobiililt");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Vastame mobiilile");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber && isOn){
            isRinging = true;
            System.out.println("Helin");
        } else {
            isRinging = false;
            System.out.println("Mobiil väljas või vale number");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public void sendSMS(){
        System.out.println("Saadab sõnumi");
    }
}
