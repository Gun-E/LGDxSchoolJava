package ex08_for문;


public class Ex03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
