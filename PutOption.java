public class PutOption extends Option {

    public PutOption(String contractSymbol, String lastTradeDate, int strike, double lastPrice, double ask, double change,
    double percentChange, int volume, int openInterest, double impliedVolatility, boolean inTheMoney,
    String contractSize, String currency) {
        super(contractSymbol, lastTradeDate, strike, lastPrice, ask, change, percentChange, volume,
        openInterest, impliedVolatility, inTheMoney, contractSize, currency);
    }
        /**
     * assumes this is the value for a single bought put option contract (100 stocks)
     * @param spotPrice current price of the security
     * @param strikePrice contract price
     * @param premium premium to buy the contract
     */
    public getValueBuy(double spotPrice, double strikePrice, double premium) {
        return (Math.max((strikePrice -  spotPrice), 0) - premium)*100;
    }

    /**
     * assumes this is the value for a single written put option contract (100 stocks)
     * @param spotPrice current price of the security
     * @param strikePrice contract price
     * @param premium premium to buy the contract
     */
    public getValueSell(double spotPrice, double strikePrice, double premium) {
        return (Math.min((strikePrice  - spotPrice), 0) + premium)*100;
    }
}
