import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
                System.out.print("Укажите текущий курс требуемой валюты: ");
                Scanner in = new Scanner(System.in);
                double kurs = in.nextDouble();
                System.out.print("Укажите количество рублей для конвертации: ");
                double rub = in.nextDouble();
                double kolvo = rub/kurs;
                //System.out.println(kolvo*1000);
                //double st = Math.round (kolvo * 1000);
                //System.out.println("Итого: " + st/1000);
                System.out.printf("Итого: " + "%.2f",kolvo);
            }
        }


