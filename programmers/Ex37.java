package programmers;

import java.util.Arrays;

public class Ex37 {
    public static void main(String[] args) {
        Ex37 ex37 = new Ex37();
        System.out.println(ex37.solution(new int[]{70,50,80,50}, 100));
        System.out.println(ex37.solution(new int[]{70,80,50}, 100));
    }
    //오답
//    public int solution(int[] people, int limit) {
//        int sum=Arrays.stream(people).sum();
//        return (sum/limit==0)? sum/limit:(sum/limit)+1;
//    }
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boatCount = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boatCount++;
        }

        return boatCount;
    }

}
