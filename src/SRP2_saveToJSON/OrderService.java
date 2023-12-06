package SRP2_saveToJSON;

import java.util.Scanner;

public class OrderService {
    Scanner scanner = new Scanner(System.in);
    private Order order;
    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    public void inputFromConsole(Order order) {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Количество: ")));
        order.setPrice(Integer.parseInt(prompt("Цена за единицу: ")));
    }

}
