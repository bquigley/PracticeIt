/*
 Add the following mutator method to the Stock class from textbook section 8.5:

public void clear()     

Resets this Stock's number of shares purchased and total cost to 0. 
*/

// A Stock object represents purchases of shares of a stock.

public class Stock {
    private String symbol;        // stock symbol, e.g. "YHOO"
    private int totalShares;      // total shares purchased
    private double totalCost;     // total cost for all shares

    // Initializes a new Stock with no shares purchased.
    // Precondition: symbol != null
    public Stock(String theSymbol) {
        if (theSymbol == null) {
            throw new NullPointerException();
        }

        symbol = theSymbol;
        totalShares = 0;
        totalCost = 0.0;
    }

    // Returns the total profit or loss earned on this stock,
    // based on the given price per share.
    // pre: currentPrice >= 0.0
    public double getProfit(double currentPrice) {
        if (currentPrice < 0.0) {
            throw new IllegalArgumentException();
        }

        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    // Records purchase of the given shares at the given price.
    // pre: shares >= 0 && pricePerShare >= 0.0
    public void purchase(int shares, double pricePerShare) {
        if (shares < 0 || pricePerShare < 0.0) {
            throw new IllegalArgumentException();
        }

        totalShares += shares;
        totalCost += shares * pricePerShare;
    }

	// Returns this Stock's symbol value.
	public String __getSymbol() {
		return symbol;
	}
	
	// Returns this Stock's total number of shares purchased.
	public int __getTotalShares() {
		return totalShares;
	}
	
	// Returns this Stock's total cost for all shares.
	public double __getTotalCost() {
		return totalCost;
	}

// YOUR CODE GOES HERE
	public void clear() {
		totalShares = 0;
		totalCost = 0.0;
	}
// MY CODE ENDS HERE
}

