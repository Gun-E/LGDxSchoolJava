package algorithmStudy;

public class Ex02 {
    public static void main(String[] args) {

        
    }
    static int solution(int in, int out) {
        int count = 0;
        for (int i = in; i <= out; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
            }
        }
        for (int i = in; i <= out; i++) {
            for (int j = 0; j <= 43-i; j++) {
                count++;
            }
        }
        return count;
    }
}
