package 변수;

public class Ex02_변수 {
    public static void main(String[] args) {
        // 변수 : 데이터를 담을 수 있는 메모리의 공간

        // 1. 변수 선언 : 메모리에 데이터를 담을 수있는 공간 확보, 값 x
        // 변수타입 (자료형 , 형) 변수명
        // 변수타입 : 저장하고자 하는 타입을 지정
        // 변수명 : 메모리 공간에 이름을 붙히는 것
        int age;
        String name;

        // 2. 변수 초기화 : 변수에 처음으로 값을 지정하는것
        // = 연산자 (대입) : 오른쪽에 있는 값을 왼쪽에 대입 하는 것
        age = 26;
        name = "강건";
        // 선언과 초기화를 한번에
        int num2 = 1;
        // 3. 재할당 : 현재 변수의 값을 버리고 새로운 값을 저장하는 것
        age = 4;
        // 4. 상수 : 변하지 않는 수 (final 키워드 사용)
        final int studentCode = 12121212;

        // 상수는 재할당 불가능
        // studentCode = 1234; <- Syntax Error
        System.out.println("나이 : " + age + "\n이름 : " + name);
        int n1 = 1;
        int n2 = 2;

        System.out.println("치환 전 n1 : "+ n1);
        System.out.println("치환 전 n2 : "+ n2);

        // 데이터를 임시로 저장 할 변수 선언
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("치환 후 n1 : "+ n1);
        System.out.println("치환 후 n2 : "+ n2);
    }
}
