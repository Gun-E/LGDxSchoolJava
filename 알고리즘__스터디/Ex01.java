package 알고리즘__스터디;

public class Ex01 {
    public static void main(String[] args) {
        int people = 4;
        System.out.println(solution(people));
    }

    public static int solution(int people) {
        int count = 0;
        for (int i = 0; i <= people; i++) {
            for (int j = 0; j <= people - i; j++) {
                int k = people - i - j;
                if ((i > j && i > k) || (j > i && j > k) || (k > i && k > j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
