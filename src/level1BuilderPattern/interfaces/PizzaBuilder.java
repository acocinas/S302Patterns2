package level1BuilderPattern.interfaces;

import level1BuilderPattern.model.Pizza;

public interface PizzaBuilder {
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}
