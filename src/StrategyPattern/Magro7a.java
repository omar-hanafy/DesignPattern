package StrategyPattern;

public class Magro7a extends Batta{
 
    Magro7a(){
        super();
        this.MyFlyBehaviour = new ICanFly();
    }
    @Override
    protected String Dsiplay() {
        return "I am Magro7a";
    }

}