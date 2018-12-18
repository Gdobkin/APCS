package Ch8Objects.HW1217;

public class GabrielleDobkinStockClient {
    public static void main(String[] args) {
        GabrielleDobkinStock snapchat = new GabrielleDobkinStock("SNAP");
        System.out.println(snapchat);
        snapchat.buy(5,10.50);
        System.out.println(snapchat);
        System.out.println("If you sold your profit will be: "+ snapchat.profit(12.50));
    }
}
