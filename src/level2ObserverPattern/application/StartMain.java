package level2ObserverPattern.application;

import level2ObserverPattern.interfaces.StockExchangeAgencies;
import level2ObserverPattern.observer.NewStockAgency;
import level2ObserverPattern.subject.NewBroker;

public class StartMain {
    public static void start(){
        NewBroker broker = new NewBroker();

        StockExchangeAgencies agency1 = new NewStockAgency("Abante Asesores");
        StockExchangeAgencies agency2 = new NewStockAgency("Acapital BB");
        StockExchangeAgencies agency3 = new NewStockAgency("Activotrade Valores");

        broker.subscribe(agency1);
        broker.subscribe(agency2);
        broker.subscribe(agency3);

        System.out.println("Creamos tres agencias que recibirán la notificación de Bolsa\n");

        broker.stockExchange(" el IBEX35 pierde un 1,23%.");

        System.out.println("\nEliminamos la segunda agencia, y dejará de recibir notificaciones\n");
        broker.unsubscribe(agency2);
        broker.stockExchange("el BBVA rompe la dinámica del IBEX35 subiendo un 7%.");

    }
}
