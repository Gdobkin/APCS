package Ch8Objects.HW1217;

public class GabrielleDobkinStock {
    private String symbol;
    private double totalCost;
    private int shares;

    public void buy(int shares, double value){
        this.shares+=shares;
        totalCost+=value*shares;
    }
    public GabrielleDobkinStock(String symbol){
        this.symbol=symbol;
    }

    public double profit(double value){
        return value*shares-totalCost;
    }

    public String toString(){
        return "Stock symbol: "+symbol+"\nStocks owned: "+shares+"\nTotal spent: "+totalCost;
    }
}
