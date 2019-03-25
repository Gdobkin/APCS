package Ch9Inheritance.StockProject;

public class MutualFund extends ShareAsset {
    private double totalShares;

    public MutualFund(String symbol, double currentPrice){
        super(symbol,currentPrice);
        totalShares = 0;
    }

    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }

    public double getTotalShares(){
        return totalShares;
    }
    public void purchase(int shares, double pricePerShare){
        totalShares+=shares;
        addCost(shares*pricePerShare);
    }
}
