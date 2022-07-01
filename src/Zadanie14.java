import java.util.Random;

public class Zadanie14 {
        public static void main(String[] args) {
            Random random = new Random();
            int[]myarr = new int[15];
            for (int x=0; x<15;x++){
                int result = random.nextInt(21);// чтоб число +-20 тоже входило в диапазон
                boolean plus = random.nextBoolean();
                if (plus){
                    myarr[x] = result;
                }
                else{
                    myarr[x] = 0-result;
                }
            }
            int max = myarr[0];
            for(int i = 1; i <myarr.length; i++){
                if (myarr[i] > max) max = myarr[i];
            }
            int min = myarr[0];
            for(int i = 1; i < myarr.length; i++){
                if (myarr[i] < min) min = myarr[i];
            }
            System.out.println("Максимальный элемент массива: "+ max);
            System.out.println("Минимальный элемент массива: "+ min);
            System.out.println("Максимальный модуль: " + (Math.max(Math.abs(min),  Math.abs(max))));
}}
