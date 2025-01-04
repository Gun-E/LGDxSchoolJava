package programmers;

public class Ex29 {
    public static void main(String[] args) {
        Ex29 ex29 = new Ex29();
        System.out.println(ex29.solution("3people unFollowed me"));
        System.out.println(ex29.solution("for the last week"));
    }

    public String solution(String s) {
        String low = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        String[] strArr = low.split("");
        result.append(strArr[0].toUpperCase());
        for (int i = 1; i <strArr.length; i++) {
            if(strArr[i-1].equals(" ")) {
                result.append(strArr[i].toUpperCase());
                continue;
            }
            result.append(strArr[i]);
        }
        return result.toString();
    }
}
