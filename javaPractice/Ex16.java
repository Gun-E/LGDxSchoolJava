package javaPractice;

public class Ex16 {
    public static void main(String[] args) {
        char c = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *(3-i)-1; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
        for (int i = 1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 *(3-i)-1; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
