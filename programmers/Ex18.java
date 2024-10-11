package programmers;

public class Ex18 {
    public static void main(String[] args) {

    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=")) {
            return n>=m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return n<=m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n>m ? 1 : 0;
        } else if( ineq.equals("<") && eq.equals("!")){
            return n<m ? 1 : 0;
        }
        return 0;
    }
}
