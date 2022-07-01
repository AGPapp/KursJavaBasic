public class Zadanie12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")){
            System.out.println(str.toUpperCase());
        }
        int ind = str.lastIndexOf('J');
        int ind2 = str.indexOf('!');
        String a = str.replace('a',  'o');
        System.out.println(a.substring(ind,ind2));
    }
}
