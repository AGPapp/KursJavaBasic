import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        String x = "константа";
        String y = "12";
        String z = "random";
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int m = in.nextInt();
        String [] mass = new String[m];
        for (int i=0; i<m; i++){
            System.out.println("Введите данные ячейки "+ (i+1)+": ");
            mass[i] = in.next();
        }
        for (String s : mass) {
            if (s.equals(x) || s.equals(y) || s.equals(z)) {
                System.out.println("Данное значение имеется в константах: " + s);
            }
        }
    }}
