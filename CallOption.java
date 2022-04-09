public class CallOption extends Option{

    public CallOption(String contractSymbol, String lastTradeDate, int strike, double lastPrice, double bid, double ask, double change,
    double percentChange, int volume, int openInterest, double impliedVolatility, boolean inTheMoney,
    String contractSize, String currency) {
        super(contractSymbol, lastTradeDate, strike, lastPrice, bid, ask, change, percentChange, volume,
        openInterest, impliedVolatility, inTheMoney, contractSize, currency);
    }

    /**
     * assumes this is the value for a single bought call option contract (100 stocks)
     * @param spotPrice current price of the security
     * @param strikePrice contract price
     * @param premium premium to buy the contract
     */
    public double getValueBuy(double spotPrice, double strikePrice, double premium) {
        return (Math.max((spotPrice - strikePrice), 0) - premium)*100;
    }

    /**
     * assumes this is the value for a single written call option contract (100 stocks)
     * @param spotPrice current price of the security
     * @param strikePrice contract price
     * @param premium premium to buy the contract
     */
    public double getValueSell(double spotPrice, double strikePrice, double premium) {
        return (Math.min((spotPrice - strikePrice), 0) + premium)*100;
    }
}
