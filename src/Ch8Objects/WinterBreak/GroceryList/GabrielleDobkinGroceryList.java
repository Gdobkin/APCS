package Ch8Objects.WinterBreak.GroceryList;

import java.util.ArrayList;

public class GabrielleDobkinGroceryList{
    private ArrayList<GabrielleDobkinGroceryItemOrder> list;

    public GabrielleDobkinGroceryList(ArrayList<GabrielleDobkinGroceryItemOrder> list) {
        this.list = list;
    }

    public void addItem(GabrielleDobkinGroceryItemOrder newItem){
        list.add(newItem);
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int i = 0; i<list.size(); i++){
            totalCost+=list.get(i).getCost();
        }
        return totalCost;
    }

    public String toString(){
        String groceryList="";
        groceryList+="List Items: \n";
        for(int i = 0; i<list.size(); i++){
            groceryList+="-\t"+list.get(i)+"\n";
        }
        groceryList+="\nTotal cost: "+this.getTotalCost();
        return groceryList;
    }
}
