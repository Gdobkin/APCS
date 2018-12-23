package Ch8Objects.WinterBreak.GroceryList;

public class GabrielleDobkinGroceryListClient {
    public static void main(String[] args) {
        GabrielleDobkinGroceryList shopping = new GabrielleDobkinGroceryList(new GabrielleDobkinGroceryItemOrder[10], 0);
        shopping.addItem(new GabrielleDobkinGroceryItemOrder("orange", 5, 5));
        shopping.addItem(new GabrielleDobkinGroceryItemOrder("banana", 3, 10));
        shopping.addItem(new GabrielleDobkinGroceryItemOrder("donuts", 1, 15));
        System.out.println(shopping);
    }
}
