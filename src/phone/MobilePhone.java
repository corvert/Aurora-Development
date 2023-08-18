package phone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact (Contact contact ){
        return this.myContacts.indexOf(contact);
        //0 v suurem, kui on olemas; -1, kui ei ole olemas
    }

    private int findContact (String contactName){
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >=0){
            System.out.println("Kontakt on juba olemas");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact (Contact contact){
        int position = findContact(contact);
        if(position < 0) {
            System.out.println("Kontakti " + contact.getName() + " ei leitud");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println("Kontakt " + contact.getName() + " kustutatud");
        return true;
    }

    public boolean updateContact (Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position<0 || findContact(newContact.getName()) >=0){
            System.out.println("Kontakti " + oldContact.getName() + " ei leitud");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " asendate " + newContact.getName() + "-ga");
        return true;
        //Kui uus kontakt on juba olemasolev kontakt, siis saame ta ikka lisada
        //meie piirang ei luba mitu sama nimega kontakti lisada
        //Kontrolli, et uus knotakt ei oleks sama ninega, kui mõni olemasolev kontakt
    }
    public Contact searchContact (String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Kontaktid: ");
        for (int i=0; i<this.myContacts.size(); i++){
            System.out.println(i+1 + ". " + this.myContacts.get(i).getName() + ", nr: "
            + this.myContacts.get(i).getPhoneNumber());
            //1.Juku, nr 122345
        }
    }
}
