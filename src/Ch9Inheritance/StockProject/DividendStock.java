package Ch9Inheritance.StockProject;

public class DividendStock extends Stock {
    private double dividends;

    public DividendStock(String symbol, double currentPrice){
        super(symbol,currentPrice);
        dividends=0.0;

    }

    public double getMarketValue(){
        return super.getMarketValue() + dividends;
    }

    public void payDividends (double amountPerShare){
        dividends += amountPerShare *getTotalShares();
    }
}
