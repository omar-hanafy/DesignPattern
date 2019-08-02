package Decorator;

public class PlainPizza implements Ipizza {
    private double cost;
    private String description;

    PlainPizza() {
        this.cost = 10;
        this.description = "Plain Pizza";
    }

    @Override
    public String getDescription() {
        return this.description;
    }


    @Override
    public Double getCost() {
        return this.cost;
    }

}
