package algorithmStudy;

public class Ex06 {
    public static void main(String[] args) {
        int maxSideLength = 1_000;
        int count = 0;

        for (int i = 1; i <= maxSideLength; i++) {
            for (int j = i; j <= maxSideLength; j++) {
                if (countSquares(i, j) == 20) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static int countSquares(int width, int height) {
        int count = 0;
        while (height != 0) {
            count += width / height;
            int temp = width % height;
            width = height;
            height = temp;
        }
        return count;
    }
}
