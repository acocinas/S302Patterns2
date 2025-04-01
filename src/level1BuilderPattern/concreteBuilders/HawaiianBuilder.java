package level1BuilderPattern.concreteBuilders;

import level1BuilderPattern.model.Pizza;
import level1BuilderPattern.interfaces.PizzaBuilder;

public class HawaiianBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianBuilder(){
        this.pizza = new Pizza();
    }
    @Override
    public void buildSize() {
        pizza.setSize("Large");
    }

    @Override
    public void buildDough() {
        pizza.setDough("American");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Tomato, mozzarella, pineapple, ham");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
