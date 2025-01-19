package programmers;

public class Ex33 {
    public static void main(String[] args) {
        Ex33 ex33 = new Ex33();
        System.out.println(ex33.solution(78));
        System.out.println(ex33.solution(15));
    }
//    public int solution(int n) {
//        int oneCount = Integer.toBinaryString(n).replaceAll("0", "").length();
//        do {
//            n++;
//        } while (oneCount != Integer.toBinaryString(n).replaceAll("0", "").length());
//        return n;
//    }
public int solution(int n) {
    int targetOneCount = Integer.bitCount(n); // n의 1의 개수
    while (true) {
        n++;
        if (Integer.bitCount(n) == targetOneCount) { // n 증가 후 1의 개수가 같으면 반환
            return n;
        }
    }
}

}
