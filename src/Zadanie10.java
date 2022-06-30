import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите количество строк: ");
        int x = in.nextInt();
        System.out.println("Укажите количество ячеек: ");
        int y = in.nextInt();
        double[][] arrey = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){
                System.out.print("Укажите значение " + (j + 1) + " строки " + (i + 1) + ": ");
                arrey[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i<y;i++){
            System.out.println(arrey[0][i]*3);}
    }
}
