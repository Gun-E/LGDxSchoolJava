package 변수;


public class Ex03_변수명규칙 {
    public static void main(String[] args) {
        //1. 예약어 (키워드) 는 변수명 불가
//        int class = 0;
        //2. 대소문자 구분
        int a = 0;
        int A = 0;

        // 3. 숫자로 시작 불가
//        int 3a = 1;
        // 4. 특수문자는 _와
        // 5. 길이 제한 x
        // 6. 한글 사용 가능
        // 7. 띄어쓰기 불가

        // 클래스명은 대문자로 시작
        // 메소드 변수명은 소문자로 시작
        // 상수는 대문자로 작성

        //표기법
        // 카멜
        int Camel = 0;
        // 파스칼
        int PasCal;
        // 스네이크
        int snake_s;
        // 헝가리안 : 자료형을 앞에 표시
        int intBackgroundColor;
    }
}
