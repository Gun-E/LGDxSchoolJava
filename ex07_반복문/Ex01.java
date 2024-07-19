package ex07_반복문;

public class Ex01 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 5) {
            System.out.print(num++);
        }

        System.out.println();

        int num1 = 0;
        while (num1 < 5) {
            System.out.print(++num1);
        }

        System.out.println();

        int num2 = 1;
        while (true) {
            System.out.print(num2++);
            if (num2 > 5) {
                break;
            }
        }
        System.out.println();
        int num3 = 1;
        do {
            System.out.print(num3++);
        }while (num3 <= 5);

        System.out.println();
    }
}
