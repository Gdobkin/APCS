package Ch9Inheritance.StockProject;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice =  currentPrice;
        totalCost = 0.0;
    }
    //getter
    public double getCurrentPrice(){
        return currentPrice;
    }
    //abstract method
    public abstract double getMarketValue();

    //getter
    public double getTotalCost() {
        return totalCost;
    }

    public double getProfit(){
        return getMarketValue()-getTotalCost();
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }

    public void addCost(double cost){
        totalCost+=cost;
    }
}
