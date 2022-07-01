import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String txt1 = in.nextLine();
        System.out.println("Введите второе число: ");
        int int1 = in.nextInt();
        //Либо:
      /*
      Integer txt2 = Integer.valueOf(txt1);
        if (txt2>int1){
            System.out.println("Больше: "+ txt2);
            double d1 = int1;
            System.out.println("Меньшее: " + d1);
        }
        else if (txt2<int1){
            System.out.println("Больше: "+ int1);
            double d1 = txt2;
            System.out.println("Меньшее: " + d1);
        }
        else {
            System.out.println("Числа равны");

        }
        */
        //либо:
        int max = Math.max(Integer.parseInt(txt1),  int1);
        double min = Math.min(Double.parseDouble(txt1),  int1);
        System.out.println("Больше: "+ max);
        System.out.println("Меньше: "+ min);

    }
}

