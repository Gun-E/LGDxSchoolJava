package ex12_ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> musicList = new ArrayList<>();

        while (true) {
            System.out.println("====Music Play List====");
            System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
            try {
                int choice = sc.nextInt();
                if (choice == 4) break;
                switch (choice) {
                    case 1 -> addMusic(musicList);
                    case 2 -> showMusic(musicList);
                    case 3 -> removeMusic(musicList);
                }
            } catch (Exception e) {
                System.out.println("잘못 입력 하셨습니다.");
                sc.nextLine();
            }
        }
        System.out.println("프로그램이 종료 되었습니다.");
    }

    private static void addMusic(List<String> musicList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");

        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
//            throw new IOException("잘못 입력 하셨습니다.");
            System.out.println("잘못 입력 하셨습니다.");
            return;
        }
        sc.nextLine();
        int index = musicList.size();
        if (choice == 1) {
            if (musicList.isEmpty()) {
                System.out.println("재생 목록이 비어있습니다!");
            } else {
                showMusic(musicList);
                System.out.print("원하는 위치 : ");
                index = sc.nextInt() - 1;
                sc.nextLine();
            }
        }
        System.out.print("추가 할 노래 입력 >> ");
        String musicName = sc.nextLine();
        musicList.add(index, musicName);
    }

    private static void removeMusic(List<String> musicList) {
        if (musicList.isEmpty()) {
            System.out.println("재생 목록이 비어있습니다!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("[1] 선택 삭제 [2] 전체삭제 >> ");
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
//            throw new IOException("잘못 입력 하셨습니다.");
            System.out.println("잘못 입력 하셨습니다.");
            return;
        }
        if (choice == 1) {
            showMusic(musicList);
            System.out.print("삭제 할 노래 선택 >> ");
            int index = sc.nextInt();
            sc.nextLine();
            musicList.remove(index - 1);
        } else {
            musicList.clear();
        }
        System.out.println("노래가 삭제 되었습니다.");
    }

    private static void showMusic(List<String> musicList) {
        if (musicList.isEmpty()) {
            System.out.println("재생 목록이 비어있습니다!");
            return;
        }
        System.out.println("============현재 재생 목록============");
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println((i + 1) + ". " + musicList.get(i));
        }
    }
}
