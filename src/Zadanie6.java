import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int z = in.nextInt();
        if (z == 1){
            System.out.println(" Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стоун, 4 - пуд ");
            int ed = in.nextInt();
            System.out.println("Количество: ");
            double x = in.nextDouble();
            switch (ed){
                case 1:
                    System.out.println("Кило: " + x);
                    System.out.println("Фунт: " + x * 2.205);
                    System.out.println("Cтоун: " + x / 6.35);
                    System.out.println("Пуд: " + x / 16.3804815);
                    break;
                case 2:
                    double y = x / 2.205;
                    System.out.println("Кило: " + y);
                    System.out.println("Фунт: " + x );
                    System.out.println("Cтоун: " + y / 6.35);
                    System.out.println("Пуд: " + y / 16.3804815);
                    break;
                case 3:
                    y = x * 6.35;
                    System.out.println("Кило: " + y);
                    System.out.println("Фунт: " + y * 2.205);
                    System.out.println("Cтоун: " + x);
                    System.out.println("Пуд: " + y / 16.3804815);
                    break;
                case 4:
                    y = x * 16.3804815;
                    System.out.println("Кило: " + y);
                    System.out.println("Фунт: " + y * 2.205);
                    System.out.println("Cтоун: " + y / 6.35);
                    System.out.println("Пуд: " + x);
                    break;
                default:
                    System.out.println("Все сломалось");
            }
        }
        else if (z == 2){
        System.out.println(" Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        int ed = in.nextInt();
        System.out.println("Количество: ");
        double kol = in.nextDouble();
            switch (ed) {
                case 1 -> {
                    System.out.println("Метров: " + kol);
                    System.out.println("Миль: " + kol / 1609);
                    System.out.println("Ярдов: " + kol * 1.094);
                    System.out.println("Футов: " + kol * 3.281);
                }
                case 2 -> {
                    System.out.println("Метров: " + kol * 1609);
                    System.out.println("Миль: " + kol);
                    System.out.println("Ярдов: " + kol * 1760);
                    System.out.println("Футов: " + kol * 5280);
                }
                case 3 -> {
                    System.out.println("Метров: " + kol / 1.094);
                    System.out.println("Миль: " + kol / 1760);
                    System.out.println("Ярдов: " + kol);
                    System.out.println("Футов: " + kol * 3);
                }
                case 4 -> {
                    System.out.println("Метров: " + kol / 3.281);
                    System.out.println("Миль: " + kol / 5280);
                    System.out.println("Ярдов: " + kol / 3);
                    System.out.println("Футов: " + kol);
                }
                default -> System.out.println("Все сломалось");
            }
        }
        else System.out.println("Выбрана незнакомая величина");
    }
}
