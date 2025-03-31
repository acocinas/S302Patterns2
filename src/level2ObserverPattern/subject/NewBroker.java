package level2ObserverPattern.subject;

import level2ObserverPattern.interfaces.Broker;
import level2ObserverPattern.interfaces.StockExchangeAgencies;

import java.util.*;

public class NewBroker implements Broker {
    private List<StockExchangeAgencies> agencies = new ArrayList<>();

    @Override
    public void subscribe(StockExchangeAgencies agency) {
        agencies.add(agency);
    }

    @Override
    public void unsubscribe(StockExchangeAgencies agency) {
        agencies.remove(agency);
    }

    @Override
    public void notifyStockExchangeAgency(String message) {
        for (StockExchangeAgencies agency: agencies){
            agency.update(message);
        }
    }
    public void stockExchange(String change){
        System.out.println("Nueva actualización en bolsa " + change);
        notifyStockExchangeAgency(change);
    }

}
