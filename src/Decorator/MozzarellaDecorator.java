package Decorator;

public class MozzarellaDecorator extends ToppingsDecorator {


    public MozzarellaDecorator(Ipizza givenPizza) {
        super(givenPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " with mozzarella";
    }


    @Override
    public Double getCost() {
        return tempPizza.getCost() + 1.0;
    }


}
