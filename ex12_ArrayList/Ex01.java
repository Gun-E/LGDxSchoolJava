package ex12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> team = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요 : ");
            String teamName = sc.nextLine();
            team.add(teamName);
        }
        System.out.print("KTX팀의 팀원은 ");
        team.forEach(a -> System.out.print(a + " "));
        System.out.println("입니다.");
    }
}
