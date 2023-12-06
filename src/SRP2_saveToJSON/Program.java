package SRP2_saveToJSON;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        OrderService orderService = new OrderService();
        orderService.inputFromConsole(order);
        System.out.println("___");
        OrderSave orderSave = new OrderSave();
        orderSave.saveToJson(order);
    }
}
