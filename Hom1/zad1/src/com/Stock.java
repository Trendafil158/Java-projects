package com;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String setSymbol, String setName)
    {
        symbol = setSymbol;
        name = setName;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return name;
    }

    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double setPreviousClosingPrice)
    {
        previousClosingPrice = setPreviousClosingPrice;
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public void setCurrentPrice(double setCurrentPrice)
    {
        currentPrice = setCurrentPrice;
    }

    public double changePercent()
    {
        if(previousClosingPrice < currentPrice)
        {
            return 100 - ((previousClosingPrice * 100) / currentPrice);
        }
        else if(previousClosingPrice == currentPrice)
        {
            return 0;
        }
        else
        {
            return 100 - ((100 * currentPrice) / previousClosingPrice);
        }
    }
}
