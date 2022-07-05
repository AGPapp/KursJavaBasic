import java.util.Scanner;

public class Itog4 {
    public static void main(String[] args) {
        String otvet = "Заархивированный вирус";
        String pod = "Подсказка";
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Для доступа к подсказке, введите 'Подсказка'");
        System.out.print("Ваш ответ: ");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        if ( otvet.equalsIgnoreCase(x)){
            System.out.println("Правильно!");
        }
        else if(pod.equalsIgnoreCase(x)){
            System.out.println("Заархивированный...");
            System.out.print("Ваш ответ: ");
            String x2 = in.nextLine();
            while (pod.equalsIgnoreCase(x2)){System.out.println("Подсказка уже недоступна");
                System.out.print("Ваш ответ: ");
                x2 = in.nextLine();
            }
            if  (otvet.equalsIgnoreCase(x2)){
                System.out.println("Правильно!");
            }
            else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        else{
            System.out.println("Подумай еще!");
            System.out.print("Ваш ответ: ");
            String x2 = in.nextLine();
            if (otvet.equalsIgnoreCase(x2)){
                System.out.println("Правильно!");
            }
            else if(pod.equalsIgnoreCase(x2)) {
                System.out.println("Подсказка уже недоступна");
                System.out.print("Ваш ответ: ");
                x2 = in.nextLine();
                while (pod.equalsIgnoreCase(x2)){System.out.println("Подсказка уже недоступна");
                    System.out.print("Ваш ответ: ");
                    x2 = in.nextLine();
                }
                if (otvet.equalsIgnoreCase(x2)){
                    System.out.println("Правильно!");
                }
                else{
                    System.out.println("Подумай еще!");
                    System.out.print("Ваш ответ: ");
                    String x3 = in.nextLine();
                    while (pod.equalsIgnoreCase(x3)){
                        System.out.println("Подсказка уже недоступна");
                        System.out.print("Ваш ответ: ");
                        x3 = in.nextLine();
                    }
                    if (otvet.equalsIgnoreCase(x3)){
                        System.out.println("Правильно!");
                    }
                    else{
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
            }
            else {
                System.out.println("Подумай еще!");
                System.out.print("Ваш ответ: ");
                x2 = in.nextLine();
                while (pod.equalsIgnoreCase(x2)){
                    System.out.println("Подсказка уже недоступна");
                    System.out.print("Ваш ответ: ");
                    x2 = in.nextLine();
                }
                if (otvet.equalsIgnoreCase(x2)){
                    System.out.println("Правильно!");
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
