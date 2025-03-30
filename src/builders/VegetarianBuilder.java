package builders;

import interfaces.PizzaBuilder;

public class VegetarianBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VegetarianBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Romana");

    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Tomato, mozzarella, eggplant, zucchini");

    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
