package StrategyPattern;

public class FlyNoFly implements FlyBehaviour{

    @Override
    public String fly() {
        return "i am can not fly :(";
    }
    
}