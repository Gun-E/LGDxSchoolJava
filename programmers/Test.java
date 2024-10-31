package programmers;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.solution(15));
    }

    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; j <= n; j++) {
                sum += j;
                if(sum == n) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
