import java.util.Scanner;

public class Itog2 {
    public static void main(String[] args) {
        System.out.print("Введите уравнение: ");
        Scanner in = new Scanner(System.in);
        String yr = in.nextLine();
        char[] arr = yr.toCharArray();
        if (Character.isLetter(arr[4])) {
            int x = Character.getNumericValue(arr[0]);
            int y = Character.getNumericValue(arr[2]);
            if (arr[1] == '+') {
                System.out.println("X = " + (x + y));
            } else {
                System.out.println("X = " + (x - y));
            }
        } else if (Character.isLetter(arr[0])) {
            int x = Character.getNumericValue(arr[4]);
            int y = Character.getNumericValue(arr[2]);
            if (arr[1] == '+') {
                System.out.println("X = " + (x - y));
            } else {
                System.out.println("X = " + (x + y));
            }
        } else {
            int x = Character.getNumericValue(arr[4]);
            int y = Character.getNumericValue(arr[0]);
            if (arr[1] == '+') {
                System.out.println("X = " + (x - y));
            } else {
                if(x>y){
                    System.out.println("X = " + (y - x));
                }
                else{System.out.println("X = " + (x + y));
                }
            }
    }
}}
