package controller;

import builders.FunghiBuilder;
import builders.HawaiianBuilder;
import builders.Pizza;
import builders.VegetarianBuilder;
import director.MasterPizzaDirector;

public class StartMain {
    public static void start(){
        FunghiBuilder funghiBuilder = new FunghiBuilder();
        MasterPizzaDirector funghiDirector = new MasterPizzaDirector(funghiBuilder);

        funghiDirector.buildPizza();
        Pizza funghiPizza = funghiDirector.getPizza();

        System.out.println("Funghi Pizza: " + funghiPizza);

        HawaiianBuilder hawaiianBuilder = new HawaiianBuilder();
        MasterPizzaDirector hawaiianDirector = new MasterPizzaDirector(hawaiianBuilder);

        hawaiianDirector.buildPizza();
        Pizza hawaiianPizza = hawaiianDirector.getPizza();

        System.out.println("Hawaiian Pizza: " + hawaiianPizza);

        VegetarianBuilder vegetarianBuilder = new VegetarianBuilder();
        MasterPizzaDirector vegetarianDirector = new MasterPizzaDirector(vegetarianBuilder);

        vegetarianDirector.buildPizza();
        Pizza vegetarianPizza = vegetarianDirector.getPizza();

        System.out.println("Vegetarian Pizza:  " + vegetarianPizza);


    }
}
