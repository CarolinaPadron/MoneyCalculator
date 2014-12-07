package persistence;

import model.Currency;
import model.ExchangeRate;
import static model.Number.fromDouble;

public class ExchangeRateLoader {

    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, fromDouble(1.34));
    }
    
}
