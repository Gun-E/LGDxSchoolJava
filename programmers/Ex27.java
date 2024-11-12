package programmers;

public class Ex27 {
    public static void main(String[] args) {
        Ex27 ex27 = new Ex27();
        System.out.println(ex27.solution("...!@BaT#*..  y.abcdefghijklm"));
        System.out.println(ex27.solution("z-+.^."));
        System.out.println(ex27.solution("=.="));
        System.out.println(ex27.solution("123_.def"));
        System.out.println(ex27.solution("abcdefghijklmn.p"));
    }

    public String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 변환
        String level1 = new_id.toLowerCase();

        // 2단계: 소문자, 숫자, '-', '_', '.'를 제외한 모든 문자 제거
        String level2 = level1.replaceAll("[^a-z0-9._-]", "");

        // 3단계: '.'가 2번 이상 연속된 부분을 하나의 '.'로 치환
        String level3 = level2.replaceAll("\\.{2,}", ".");

        // 4단계: '.'가 처음이나 끝에 위치하면 제거
        String level4 = level3;
        if (level4.startsWith(".")) {
            level4 = level4.substring(1);
        }
        if (level4.endsWith(".")) {
            level4 = level4.substring(0, level4.length() - 1);
        }

        // 5단계: 빈 문자열이라면 "a"를 대입
        String level5 = level4;
        if (level5.isEmpty()) {
            level5 = "a";
        }

        // 6단계: 길이가 16자 이상이면 첫 15개의 문자만 남기고, 끝에 위치한 '.' 제거
        String level6 = level5;
        if (level6.length() >= 16) {
            level6 = level6.substring(0, 15);
            if (level6.endsWith(".")) {
                level6 = level6.substring(0, level6.length() - 1);
            }
        }

        // 7단계: 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복해서 붙임
        String level7 = level6;
        if (level7.length() <= 2) {
            StringBuilder new_idBuilder = new StringBuilder(level7);
            while (new_idBuilder.length() < 3) {
                new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
            }
            level7 = new_idBuilder.toString();
        }

        return level7;
    }
}
