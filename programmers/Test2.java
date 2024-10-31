package programmers;

public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println(test.solution(2, 4));
//        System.out.println(test.solution(1, 5));
    }

    public long solution(int k, int d) {
        double maxArea = (d * d * 3.14) / 4;
        System.out.println("max area = " + maxArea);
        int count = 0;
        for (int i = 0; i <= d; i += k) {
            for (int j = 0; j <= d; j += k) {
                if (i * j <= maxArea) {
                    System.out.println("( " + i + ", " + j + " )");
                    count++;
                }
            }
        }

        return count;
    }

}
