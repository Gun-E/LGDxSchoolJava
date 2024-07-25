package ex10_배열;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {

//        // 1. 문자열 데이터를 담을 수 있는 레퍼런스 변수(배열) strName을 선언
//        String[] strName;
//        // 2. 문자열 10개를 담을 배열을 생성
//        strName = new String[10];
//        // 3. strName배열에 과목명으로 초기화
//        char c = 'A';
//        for (int i = 0; i < strName.length; i++) {
//            strName[i] = "과목" + c++;
//        }
        String[] strName = {"Alice", "Bob", "Charlie", "DB", "Eve"};
        // 4. strName에 들어있는 값 조회(반복문 활용)
        Arrays.stream(strName).toList().forEach(System.out::println);
        // 5. DB가 몇 번째 방(인덱스)에 있는지 출력
        int indexOpt = IntStream.range(0, strName.length)
                .filter(i -> strName[i].equals("DB"))
                .findFirst()
                .getAsInt();
        System.out.println(indexOpt);
    }
}
