package ex01_변수및입출력;

public class Ex04_기본자료형 {
    public static void main(String[] args) {
        // 기본자료형

        // 1. 논리형 (true/false) (1byte)
        boolean yes = true;
        boolean no = false;

        // 2. 문자형 '' 문자 1개만 저장 (2byte)
        char char1 = 'A';
        char char2 = 65; // 유니코드 슛자로도 저장 가능

        System.out.println(char1);
        System.out.println(char2);

        // 3. 정수형
        // 3-1. byte(1byte) -128~127
        byte num1 = 127;

        // 3-2. short (2byte) -32768~32767
        short num2 = 32767;

        // 3-3. int(4byte) 기본 정수형 타입 -2147483648~ 2147483648
        int num3 = 65535;

        // 3-4. long(8byte)
        long num4 = 65535;
        Long num42 = 4444L;

        // 4. 실수형
        // 4-2. float (4byte)
        // 소수점 7자리
        float num5 = 123.456f;

        // 4-2. double (8byte)
        // 소수점 15자리
        double num6 = 123.456;
        System.out.println(num5 + " " + num6);
    }
}
