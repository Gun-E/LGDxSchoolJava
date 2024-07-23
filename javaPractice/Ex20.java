package javaPractice;

public class Ex20 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];
        int first = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[j][i] = first++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}