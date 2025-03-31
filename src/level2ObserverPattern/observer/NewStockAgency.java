package level2ObserverPattern.observer;

import level2ObserverPattern.interfaces.Broker;
import level2ObserverPattern.interfaces.StockExchangeAgencies;

import java.io.ObjectInputStream;

public class NewStockAgency implements StockExchangeAgencies {
    private String name;

    public NewStockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " actualización bolsa " + message);
    }
}
