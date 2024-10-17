package programmers;

public class Ex25 {
    public static void main(String[] args) {
        Ex25 ex25 = new Ex25();
        System.out.println(ex25.solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4}));
    }

    public long solution(int[] sequence) {
        long answer = 0;
        boolean isPlus = true;
        long purse1 = 0;
        long purse2 = 0;
        for (int num : sequence) {
            purse1 += isPlus ? num : -num;
            purse2 += isPlus ? -num : num;
            purse1 = Math.max(0, purse1);
            purse2 = Math.max(0, purse2);
            answer = Math.max(answer, Math.max(purse1, purse2));
            isPlus = !isPlus;
        }
        return answer;
    }


}
