package Decorator;

public abstract class  ToppingsDecorator implements Ipizza {
    Ipizza tempPizza;

    public ToppingsDecorator(Ipizza givenPizza){
        this.tempPizza = givenPizza;
    }
}
