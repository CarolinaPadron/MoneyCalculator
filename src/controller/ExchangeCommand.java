package controller;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import model.Number;
import persistence.ExchangeRateLoader;
import process.Exchanger;
import ui.ExchangeDialog;
import ui.MoneyDisplay;


public class ExchangeCommand {
    
    CurrencySet set;

    public ExchangeCommand(CurrencySet set) {
        this.set = set;
    }

    public void execute() {
        Exchange exchange = readExchange();
        ExchangeRate rate = readExchangeRate(exchange);
        Money result = convert(exchange,rate);
        displayResult(result,rate);
    }

    private Exchange readExchange() {
        return new ExchangeDialog(set).getExchange();
    }

    private ExchangeRate readExchangeRate(Exchange exchange) {
        return new ExchangeRateLoader().load(exchange.getMoney().getCurrency(),exchange.getCurrency());
    }

    private Money convert(Exchange exchange, ExchangeRate rate) {
        Money money = exchange.getMoney();
        Number number = money.getAmount();
        return Exchanger.convert(exchange.getCurrency(), number, rate.getRate());
    }

    private void displayResult(Money result, ExchangeRate rate) {
        new MoneyDisplay(result, rate).display();
    }
    
    
}
