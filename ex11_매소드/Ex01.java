package ex11_매소드;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 15;
        char op = '*';
        System.out.println(cal(num1, num2, op));
    }

    private static int cal(int num1, int num2, char op) {
        return switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalStateException("연산자 오류");
        };
    }
}
