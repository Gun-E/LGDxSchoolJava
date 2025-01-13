package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex1541 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();

    /// /        String s = "00009-00009";
//        String[] split = s.split("");
//
//        List<String> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < split.length; i++) {
//            if (split[i].equals("-") || split[i].equals("+")) {
//                list.add(sb.toString());
//                list.add(split[i]);
//
//                sb.delete(0, sb.length());
//                sb = new StringBuilder();
//            } else if (i == split.length - 1) {
//                sb.append(split[i]);
//                list.add(sb.toString());
//            } else sb.append(split[i]);
//        }
//        int sum = 0;
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("-")) {
//                int miusSum = 0;
//                while (true) {
//                    i++;
//                    if (i == list.size()) break;
//                    if (list.get(i).equals("-")) {
//                        break;
//                    } else if (list.get(i).equals("+")) {
//                        continue;
//                    }
//                    miusSum += Integer.parseInt(list.get(i));
//                }
//                sum -= miusSum;
//                continue;
//            } else if (list.get(i).equals("+")) {
//                continue;
//            }
//            sum += Integer.parseInt(list.get(i));
//        }
//        System.out.println(sum);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] parts = s.split("-");

        int sum = 0;

        String[] firstParts = parts[0].split("\\+");
        for (String num : firstParts) {
            sum += Integer.parseInt(num);
        }

        for (int i = 1; i < parts.length; i++) {
            String[] nextParts = parts[i].split("\\+");
            int temp = 0;
            for (String num : nextParts) {
                temp += Integer.parseInt(num);
            }
            sum -= temp;
        }

        System.out.println(sum);
    }
}