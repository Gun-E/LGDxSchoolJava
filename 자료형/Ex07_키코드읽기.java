package 자료형;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_키코드읽기 {
    public static void main(String[] args) throws IOException {
        //키보드에 입력한 키코드 가져오기
        System.out.println("키보드 입력 : ");
        int keyCode = System.in.read();
        System.out.println(keyCode);

        //2개이상 키코드는 불가 하기 때문에 Scanner 클래스 사용
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Ex08_Scanner e = new Ex08_Scanner();
    }
}
