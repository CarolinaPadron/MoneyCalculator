package ui;

import java.util.Scanner;
import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;
import static model.Number.fromDouble;

public class ExchangeDialog {

    private final CurrencySet set;
    Exchange exchange;

    public ExchangeDialog(CurrencySet set) {
        this.set = set;
        exchange = new Exchange(new Money(fromDouble((double)readAmount()), readCurrency("Divisa origen")), readCurrency("Divisa destino"));
    }

    private Currency readCurrency(String string) {
        System.out.println("Elija una divisa " + string + ": ");
        showCurrencies(set);
        Scanner sacanner = new Scanner(System.in);
        while (true) {
            String e = sacanner.nextLine();
            Currency available = set.getCurrency(e);
            if (available != null) {
                return available;
            }
            System.out.println("Divisa no encontrada. Intruduzca otra, por favor");
        }
    }

    private float readAmount() {
        System.out.println("Cuantía: ");
        Scanner quantity = new Scanner(System.in);
        return quantity.nextFloat();
    }

    private void showCurrencies(CurrencySet set) {
        int i = 0;
        for (Currency currency : set.getSet()) {
            System.out.println(currency.toString() + " (" + i++ + ") ");
        }
    }

    public Exchange getExchange() {
        return exchange;
    }

}
