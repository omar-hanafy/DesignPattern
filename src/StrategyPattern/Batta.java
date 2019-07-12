package StrategyPattern;

public abstract class Batta {
    private int id;
    private String name;
    private static int counter = 0;
    protected FlyBehaviour MyFlyBehaviour;
    Batta() {
        this.id = counter++;
        this.name = " #Batta" + this.id;
        this.MyFlyBehaviour = new FlyNoFly();
    } 

    public String Swim() {

        return "Hey there!, I am swimming :D";
    }
    protected abstract String Dsiplay();
    public void perform (){
   System.out.println("hey i am" + this.name);   
   System.out.println(this.Swim());   
   System.out.println(this.Dsiplay());  
   System.out.println(this.MyFlyBehaviour.fly());  
    


    }
}