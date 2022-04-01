public class Option {
    private String contractSymbol;
    private String lastTradeDate;
    private int strike;
    private double lastPrice;
    private double ask;
    private double change;
    private double percentChange;
    private int volume;
    private int openInterest;
    private double impliedVolatility;
    private boolean inTheMoney;
    private String contractSize;
    private String currency;



    public Option(String contractSymbol, String lastTradeDate, int strike, double lastPrice, double ask, double change,
                    double percentChange, int volume, int openInterest, double impliedVolatility, boolean inTheMoney,
                    String contractSize, String currency) {
        this.contractSymbol = contractSymbol;
        this.lastTradeDate = lastTradeDate;
        this.strike = strike;
        this.lastPrice = lastPrice;
        this.ask = ask;
        this. change = change;
        this. percentChange = percentChange;
        //csv seems to sometimes not have a volume value
        if (volume == NULL) {
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

    public void getContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }
    public void getLastTradeDate(String lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }
    public void getStrike(int strike) {
        this.strike = strike;
    }
    public void getLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }
    public void getAsk(double ask) {
        this.ask = ask;
    }
    public void getChange(double change) {
        this.change = change;
    }
    public void getPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }
    public void getVolume(int volume) {
        this.volume = volume;
    }
    public void getOpenInterest(int openInterest) {
        this.openInterest = openInterest;
    }
    public void getImpliedVolatility(double impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
    }
    public void getInTheMoney(boolean inTheMoney) {
        this.inTheMoney = inTheMoney;
    }
    public void getContractSize(String contractSize) {
        this.contractSize = contractSize;
    }
    public void getCurrency(String currency) {
        this.currency = currency;
    }
}
