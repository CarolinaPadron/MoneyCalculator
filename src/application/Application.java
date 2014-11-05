package application;

import model.CurrencySet;
import persistence.CurrencySetLoader;

public class Application {

    public static void main(String[] args) {
        CurrencySet set = new CurrencySetLoader().load();
    }
    
}
