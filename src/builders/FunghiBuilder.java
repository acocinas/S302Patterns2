package builders;

import interfaces.PizzaBuilder;

public class FunghiBuilder implements PizzaBuilder{
    private Pizza pizza;

    public FunghiBuilder() {
        this.pizza = new Pizza();
    }
    @Override
    public void buildSize() {
        pizza.setSize("Extra large");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Napolitana");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Tomato, mozzarella, mushrooms, ham");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
