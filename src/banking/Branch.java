package banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }


    public boolean newCustomer (String name, double initialAmount){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName){
        for (int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null; //jõuab siia kui kõik nimed on kontrollitud ja vastet ei leitud
    }






    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
