package Decorator;

public class PizzaSimulator {
    public static void main(String[] args) {
        Ipizza ipizza = new PizzaBuilder()
                            .addMozzarella()
                            .addZatoon()
                            .Build();

        System.out.println(ipizza.getCost() + " " + ipizza.getDescription())  ;

    }
}