package process;

import model.Currency;
import model.Money;
import model.Number;

public class Exchanger {

    public static Money convert(Currency currency, Number amount, Number rate) {
        return new Money(amount.multiply(rate), currency);
    }
    
}
