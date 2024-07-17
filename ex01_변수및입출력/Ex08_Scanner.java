package ex01_변수및입출력;

import java.util.Scanner;

public class Ex08_Scanner {
    public static void main(String[] args) {
        // Scanner 클래스 입력 장치로 부터 읽어드린 바이트를 문자 정수 실수 등으로 바꿔주는 클래스
        // Scanner 클래스 위치 : JRE-java.base-java.util.Scanner
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        System.out.println(s);

        s = scanner.nextLine();
        System.out.println(s);
    }
}
