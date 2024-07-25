package ex09_메모리;

public class Ex01 {
    int s = 1;

    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
        s2 = "change";
        System.out.println(s1);
        System.out.println(s2);

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        StringBuilder sb2= new StringBuilder(s1);
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
    }
}
