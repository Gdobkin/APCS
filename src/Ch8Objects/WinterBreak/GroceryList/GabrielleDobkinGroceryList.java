package Ch8Objects.WinterBreak.GroceryList;

public class GabrielleDobkinGroceryList{
    private GabrielleDobkinGroceryItemOrder[] list;
    private int numItems;

    public GabrielleDobkinGroceryList(GabrielleDobkinGroceryItemOrder[] list, int numItems) {
        this.list = list;
        this.numItems = numItems;
    }

    public void addItem(GabrielleDobkinGroceryItemOrder newItem){
        list[numItems]=newItem;
        numItems++;
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int i = 0; i<numItems; i++){
            totalCost+=list[i].getCost();
        }
        return totalCost;
    }

    public String toString(){
        String groceryList="";
        groceryList+="List Items: \n";
        for(int i = 0; i<numItems; i++){
            groceryList+="-\t"+list[i]+"\n";
        }
        groceryList+="\nTotal cost: "+this.getTotalCost();
        return groceryList;
    }
}
