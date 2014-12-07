package ui;

import model.ExchangeRate;
import model.Money;

public class MoneyDisplay {

    private static Money money;
    private static ExchangeRate rate;

    public MoneyDisplay(Money money, ExchangeRate rate) {
        this.money = money;
        this.rate = rate;
    }

    public void display() {
        System.out.println("El cambio de " + rate.getFrom()
                + " a " + rate.getTo() + " es: " + rate.getRate());
        System.out.println("Su cambio es de: " + money.toString());
    }

}
