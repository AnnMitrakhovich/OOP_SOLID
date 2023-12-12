package Pattern_Decorator;
// структурный паттерн, расширяет объект новой функциональностью, не используя наследование

public class MainDecorator {
    public static void main(String[] args) {
        Pizza pizza = new PeperoniDecorator(new CheeseDecorator( new CheeseDecorator(new PizzaDough())));
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
    }
}