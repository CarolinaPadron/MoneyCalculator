package model;

import java.util.ArrayList;

public class CurrencySet {

    private final ArrayList<Currency> set;

    public CurrencySet() {
        set = new ArrayList<Currency>();
    }

    public void add(Currency currency) {
        set.add(currency);
    }

    public Currency getCurrency(String e) {
        for (Currency currency : set) {
            if (currency.getName().equals(e)) {
                return currency;
            }
        }
        return null;
    }

    public ArrayList<Currency> getSet() {
        return set;
    }

    @Override
    public String toString() {
        return "CurrencySet{" + "set=" + set + "}";
    }
}
