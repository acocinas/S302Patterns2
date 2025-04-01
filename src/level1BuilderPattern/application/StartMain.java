package level1BuilderPattern.application;

import level1BuilderPattern.concreteBuilders.FunghiBuilder;
import level1BuilderPattern.concreteBuilders.HawaiianBuilder;
import level1BuilderPattern.model.Pizza;
import level1BuilderPattern.concreteBuilders.VegetarianBuilder;
import level1BuilderPattern.director.MasterPizzaDirector;

public class StartMain {
    public static void start(){
        FunghiBuilder funghiBuilder = new FunghiBuilder();
        MasterPizzaDirector funghiDirector = new MasterPizzaDirector(funghiBuilder);

        funghiDirector.buildPizza();
        Pizza funghiPizza = funghiBuilder.getPizza();

        System.out.println("Funghi Pizza: " + funghiPizza);

        HawaiianBuilder hawaiianBuilder = new HawaiianBuilder();
        MasterPizzaDirector hawaiianDirector = new MasterPizzaDirector(hawaiianBuilder);

        hawaiianDirector.buildPizza();
        Pizza hawaiianPizza = hawaiianBuilder.getPizza();

        System.out.println("Hawaiian Pizza: " + hawaiianPizza);

        VegetarianBuilder vegetarianBuilder = new VegetarianBuilder();
        MasterPizzaDirector vegetarianDirector = new MasterPizzaDirector(vegetarianBuilder);

        vegetarianDirector.buildPizza();
        Pizza vegetarianPizza = vegetarianBuilder.getPizza();

        System.out.println("Vegetarian Pizza:  " + vegetarianPizza);


    }
}
