package level2ObserverPattern.interfaces;

public interface Broker {
    void subscribe(StockExchangeAgencies stockExchangeAgencies);
    void unsubscribe(StockExchangeAgencies stockExchangeAgencies);
    void notifyStockExchangeAgency(String message);
}
