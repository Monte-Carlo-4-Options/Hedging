public class Option {
    private String contractSymbol;
    private String lastTradeDate;
    private int strike;
    private double lastPrice;
    private double bid;
    private double ask;
    private double change;
    private double percentChange;
    private int volume;
    private int openInterest;
    private double impliedVolatility;
    private boolean inTheMoney;
    private String contractSize;
    private String currency;



    public Option(String contractSymbol, String lastTradeDate, int strike, double lastPrice, double bid, double ask, double change,
                    double percentChange, int volume, int openInterest, double impliedVolatility, boolean inTheMoney,
                    String contractSize, String currency) {
        this.contractSymbol = contractSymbol;
        this.lastTradeDate = lastTradeDate;
        this.strike = strike;
        this.lastPrice = lastPrice;
        this.bid = bid;
        this.ask = ask;
        this.change = change;
        this.percentChange = percentChange;
        //csv seems to sometimes not have a volume value
        if (volume == null) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        this.openInterest = openInterest;
        this.impliedVolatility = impliedVolatility;
        this.inTheMoney = inTheMoney;
        this.contractSize = contractSize;
        this.currency = currency;
    }

    /**************************GETTERS***********************/

    public String getContractSymbol() {
        return this.contractSymbol;
    }
    public String getLastTradeDate() {
        return this.lastTradeDate;
    }
    public int getStrike() {
        return this.strike;
    }
    public double getLastPrice() {
        return this.lastPrice;
    }
    public double getBid() {
        return this.bid;
    }
    public double getAsk() {
        return this.ask;
    }
    public double getChange() {
        return this.change;
    }
    public double getPercentChange() {
        return this.percentChange;
    }
    public int getVolume() {
        return this.volume;
    }
    public int getOpenInterest() {
        return this.openInterest;
    }
    public double getImpliedVolatility() {
        return this.impliedVolatility;
    }
    public boolean getInTheMoney() {
        return this.inTheMoney;
    }
    public String getContractSize() {
        return this.contractSize;
    }
    public String getCurrency() {
        return this.currency;
    }

    /***************************Setters*******************/

    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }
    public void setLastTradeDate(String lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }
    public void setStrike(int strike) {
        this.strike = strike;
    }
    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }
    public void setBid(double bid) {
        this.bid = bid;
    }
    public void setAsk(double ask) {
        this.ask = ask;
    }
    public void setChange(double change) {
        this.change = change;
    }
    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setOpenInterest(int openInterest) {
        this.openInterest = openInterest;
    }
    public void setImpliedVolatility(double impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
    }
    public void setInTheMoney(boolean inTheMoney) {
        this.inTheMoney = inTheMoney;
    }
    public void setContractSize(String contractSize) {
        this.contractSize = contractSize;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
