package level1BuilderPattern.director;

import level1BuilderPattern.model.Pizza;
import level1BuilderPattern.interfaces.PizzaBuilder;

public class MasterPizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public MasterPizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza buildPizza(){
        pizzaBuilder.buildSize();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildToppings();
        return pizzaBuilder.getPizza();
    }
}
