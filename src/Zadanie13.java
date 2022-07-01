import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите из слов, разделенных пробелами: ");
        String txt = in.nextLine();
        String[] arrTxt =  txt.split(" ");
        String l = "abcdefghijklmnopqrstuvwxyz";
        int mass = 0;
        char[] lang = l.toCharArray();
        for (String s : arrTxt) {
            char[] slovo = s.toCharArray();
            // System.out.println("slovo"+slovo.length);
            int r = 0;
            for (int z = 0; z < slovo.length; z++) {
                for (int w = 0; w < lang.length; w++) {
                    if (Character.toLowerCase(slovo[z]) == lang[w]) {
                        // System.out.println(slovo[z] + "-" + z +"-"+ lang[w] );
                        r++;
                    }
                }
                if (r == slovo.length) {
                    System.out.println(s);
                    mass++;
                }
            }
        }
        System.out.println(mass);
    }
}


