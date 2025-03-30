package level1BuilderPattern.director;

import level1BuilderPattern.entity.Pizza;
import level1BuilderPattern.interfaces.PizzaBuilder;

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
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
}
