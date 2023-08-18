package bankaccount;

public class Account {

    private String accNumber;
    private double balance;
    private String custName;
    private String email;
    private String phone;

    //peb olema sama ninega kui klass
    public Account(String accNumber, double balance, String custName, String email, String phone) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
        System.out.println("Terve konstruktor");
    }

    public Account() {
        this("0000", 0, "defualt", "defoaut@mail.ee", "00000");
        System.out.println("Tühi konstrukor");

    }

    public Account(String accNumber, double balance, String custName) {
        this(accNumber, balance, custName, "vaikismis@mail.ee", "5512345");
        System.out.println("Osaline konstruktor");

    }

    public void withDraw(double amount) {
        if (balance < amount) {
            System.out.println("Pole piisavalt raha");
        } else {
            balance = balance - amount;
            System.out.println("Välja võetud " + amount + " kontol alles " + balance);
        }
    }


    public void deposit(double amount) {
        balance = balance + amount;

    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
