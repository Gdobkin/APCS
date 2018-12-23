package Ch8Objects.WinterBreak.GroceryList;

public class GabrielleDobkinGroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GabrielleDobkinGroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost(){
        return pricePerUnit*quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String toString(){
        return name + " in the quantity of "+quantity+" costs "+getCost();
    }
}
