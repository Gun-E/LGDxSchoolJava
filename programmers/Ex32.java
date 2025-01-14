package programmers;

public class Ex32 {
    public static void main(String[] args) {
        Ex32 ex32 = new Ex32();
        System.out.println(ex32.solution(15));
    }

    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if(sum>n) break;
                else if(sum==n) count++;
            }
        }
        return count;
    }
}
