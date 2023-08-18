package tund12.staticfinal;

public class Password {

    private static final int key = 10; //psfi lühend
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }


    private int encryptDecrypt(int password) {
        return password * key;
    }

    public final void storePassword() {
        System.out.println("Salvesta parooli kui " + encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Tere tulemast");
            return true;
        }
        System.out.println("vale");
        return false;
    }


}

