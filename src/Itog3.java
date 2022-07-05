import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String[] myArr = new String[x];
        int[] count = new int[x];

        for (int i = 0; i < myArr.length; i++ ){
            System.out.print("Введите строку "+(i+1)+":" );
            myArr[i] = in.next();}
        for (int i = 0; i < myArr.length; i++){
            int g = 0;
            char[] charArr = myArr[i].toCharArray();
            for (char c : charArr) {
                for (int b = 0; b < charArr.length; b++) {
                    if (c != charArr[b]) {
                        g++;
                    }
                }
                count[i] = g;
            }
        }
        int max = count[0];
        int f = 0;
        for(int i = 0; i <count.length; i++){
            if (count[i] > max) { max = count[i];
                f = i;}
        }
        System.out.println(myArr[f]);
    }
}
