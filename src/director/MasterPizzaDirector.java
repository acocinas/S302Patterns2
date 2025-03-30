package director;

import interfaces.PizzaBuilder;

public class MasterPizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public MasterPizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public void buildPizza(){
        pizzaBuilder.buildSize();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildToppings();
    }
    public builders.Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
}
