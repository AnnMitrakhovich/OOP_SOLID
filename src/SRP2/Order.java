package SRP2;

import java.util.Scanner;

public class Order {
    Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    public void inputFromConsole() {
        clientName = prompt("Имя клиента: ");
        product = prompt("Продукт: ");
        qnt = Integer.parseInt(prompt("Количество: "));
        price = Integer.parseInt(prompt("Цена за единицу: "));
    }


}
