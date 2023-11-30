package SRP;
// в основном методе считаем площадь
// отдельно создаем класс Draw, где описываем, как отобразить-отрисовать квадрат в консоли (масштаб, цвет и т.д.)
public class Program {
    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        System.out.println("Площадь квадрата равна " + square.getArea());
    }
}
