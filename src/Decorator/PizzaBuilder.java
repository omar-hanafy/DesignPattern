package Decorator;

public class PizzaBuilder {
    Ipizza ipizza = new PlainPizza();

    PizzaBuilder addMozzarella() {
        this.ipizza = new MozzarellaDecorator(this.ipizza);
        return this;
    }

    PizzaBuilder addZatoon() {
        this.ipizza = new ZatoonDecorator(this.ipizza);
        return this;
    }

    Ipizza Build() {
        Ipizza toreturn = this.ipizza;
        this.ipizza = new PlainPizza();
        return toreturn;
    }
}
