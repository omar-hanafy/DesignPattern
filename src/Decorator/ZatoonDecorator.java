package Decorator;

public class ZatoonDecorator extends ToppingsDecorator{


    public ZatoonDecorator(Ipizza givenPizza) {
        super(givenPizza);
    }



    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " and zatoon";
    }



    @Override
    public Double getCost() {
        return tempPizza.getCost() + 2.0;
    }


}
