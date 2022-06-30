import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int n = in.nextInt();
        double [] arrey = new double[n];
        double mean;
        double sum = 0;

        for (int i =0; i<n;i++){
        System.out.println("Укажите значение ячейки: " + (i+1));
        arrey[i]= in.nextDouble();
            sum = arrey[i] +sum;
            }

        mean = sum/n;
        for (double v : arrey) {
            System.out.println(v * mean);
        }

    }
}
