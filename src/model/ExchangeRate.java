package model;

public class ExchangeRate {
    
    private Currency from;
    private Currency to;
    private Number rate;

    public ExchangeRate(Currency from, Currency to, Number rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Number getRate() {
        return rate;
    }

    
    
    
    
}
