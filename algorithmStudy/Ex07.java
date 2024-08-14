package algorithmStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex07 {
    public static void main(String[] args) {
        int size = 3;

//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = i + 1;
//        }
//        List<int[]> result = new ArrayList<>();
//        generatePermutations(arr, 0, result);
//        result.forEach(c -> {
//            System.out.println(Arrays.toString(c)+" Count: " + sortCount(c));
//        });
        System.out.println(sortCount(new int[]{3, 1, 2}));
    }
    private static void generatePermutations(int[] arr, int start, List<int[]> result) {
        if (start == arr.length - 1) {
            result.add(arr.clone());
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                generatePermutations(arr, start + 1, result);
                swap(arr, start, i);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    static int sortCount(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            while (arr[i] <= arr[i - 1]) {
                count++;
                arr = moveFirst(arr, i);
                i=1;
                System.out.println(Arrays.toString(arr));
            }
        }
        return count;
    }

    private static int[] moveFirst(int[] arr, int index) {
        int element = arr[index];
        int[] newArr = new int[arr.length];
        newArr[0] = element;
        System.arraycopy(arr, 0, newArr, 1, index);
        if (arr.length - (index + 1) >= 0)
            System.arraycopy(arr, index + 1, newArr, index + 1, arr.length - (index + 1));
        return newArr;
    }

}
