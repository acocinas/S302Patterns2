package level1BuilderPattern.entity;

public class Pizza {
    private String size;
    private String dough;
    private String toppings;

    public Pizza() {
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "size-> " + size + "; dough-> " + dough + "; toppings-> " + toppings;
    }
}
