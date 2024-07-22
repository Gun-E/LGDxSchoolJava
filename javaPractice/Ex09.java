package javaPractice;

public class Ex09 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 77; i > 0; i--) {
            result +=  i * (77-i+1);
        }
        System.out.println(result);
    }
}
