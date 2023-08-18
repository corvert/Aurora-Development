package listid;

import java.util.ArrayList;

public class GroseryList {

    private ArrayList <String> grocerList = new ArrayList<>();
    //<> vahel määratakse listis hoitvat andmetüüp
    //nr-d pole, ei pea pikkust määrama

    public ArrayList<String> getGrocerList() {
        return grocerList;
    }

    public void addItem(String item){ // lisame asjad
        grocerList.add(item);

    }
    public void printGrocerList(){ // saame teada palju asju on
        System.out.println("Sul on " + grocerList.size() + " asja listis");
        for (int i=0; i<grocerList.size(); i++){
            System.out.println((i+1) + ". " + grocerList.get(i));
        }
    }
    // asendamine
    private void modifyItem (int position, String newItem){

        grocerList.set(position, newItem);
    }

    public void modifyItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyItem(position, newItem);
        }

    }
    private void removeItem (int position){
        grocerList.remove(position);
    }

    public void removeItem (String item){
        int positon = findItem(item);
        if (positon >= 0){
            removeItem(positon);
        }
    }

    private int findItem (String searchItem){
        return grocerList.indexOf(searchItem);
    }

    public boolean onFile (String searchItem){
       int position = findItem(searchItem);
       return position >= 0;
    }

}
