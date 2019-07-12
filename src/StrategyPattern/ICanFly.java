package StrategyPattern;

public class ICanFly implements FlyBehaviour{

    @Override
    public String fly() {
        return "i am can fly :)";
    }
    
}