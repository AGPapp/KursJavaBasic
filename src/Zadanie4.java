import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите x: ");
                double x = in.nextDouble();
                System.out.println("Введите y: ");
                double y = in.nextDouble();
                System.out.println("Введите z: ");
                double z = in.nextDouble();
                double sum = x + y + z;
                System.out.println(sum / 3);
                double round = (Math.floor((sum / 3)/2));
                System.out.println(round);
                if (round > 3) {
                    System.out.println("Программа выполнена корректно");
                    }
    }
}
