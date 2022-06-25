import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        System.out.println("Введите арифметический оператор (+,-,*,/): ");
        String z = in.next();
        switch (z) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);
            default -> System.out.println("Оператор не известен");
        }

    }
}
