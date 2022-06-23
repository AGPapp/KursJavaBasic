public class ZadanieTri {
    public static void main(String[] args) {
        int[] mass = {2,4,45,16,11};

        int x = mass[0];
        mass[0] = mass[mass.length - 1];
        mass[4] = x;

        int sum = mass[0] + mass[mass.length - 3];

        System.out.println("Теперь первый элемент: " + mass[0]);
        System.out.println("Теперь последний элемент: "+mass[mass.length - 1]);
        System.out.println("Cумма первого и среднего элемента: " + sum);
    }
}
