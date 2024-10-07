package programmers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"14 + 3 = 17", "13 - 6 = X", "51 - 5 = 44"})));
        System.out.println(Arrays.toString(solution(new String[]{"1 + 1 = 2", "1 + 3 = 4", "1 + 5 = X", "1 + 2 = X"})));
        System.out.println(Arrays.toString(solution(new String[]{"10 - 2 = X", "30 + 31 = 101", "3 + 3 = X", "33 + 33 = X"})));
        System.out.println(Arrays.toString(solution(new String[]{"2 - 1 = 1", "2 + 2 = X", "7 + 4 = X", "5 - 5 = X"})));
        System.out.println(Arrays.toString(solution(new String[]{"2 - 1 = 1", "2 + 2 = X", "7 + 4 = X", "8 + 4 = X"})));
    }

    public static String[] solution(String[] expressions) {
        List<String> listExpressions = new ArrayList<>();
        List<List<Integer>> ops = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");

        for (String expression : expressions) {
            Matcher matcher = pattern.matcher(expression);
            while (matcher.find()) {
                if(Integer.parseInt(matcher.group()) < 10)
                    numbers.add(Integer.parseInt(matcher.group()));
            }
        }
        int maxNumber = numbers.stream().max(Integer::compareTo).orElse(-1);

        for (String expression : expressions) {
            List<String> list = extractNumbersAndOperators(expression);
            List<Integer> baseOp = new ArrayList<>();

            String resultNumber = list.get(3);
            if (resultNumber.equals("X")) {
                listExpressions.add(expression);
                continue;
            }

            if (ops.isEmpty()) {
                for (int j = maxNumber + 1; j <= 9; j++) {
                    int firstNumber = convertToDecimal(list.get(0), j);
                    String operator = list.get(1);
                    int secNumber = convertToDecimal(list.get(2), j);

                    if (firstNumber == 0 || secNumber == 0) continue;
                    int opNum = operator.equals("+") ? firstNumber + secNumber : firstNumber - secNumber;

                    if (opNum == convertToDecimal(resultNumber, j)) {
                        baseOp.add(j);
                    }
                }
            } else {
                for (List<Integer> op : ops) {
                    for (Integer integer : op) {
                        int firstNumber = convertToDecimal(list.get(0), integer);
                        String operator = list.get(1);
                        int secNumber = convertToDecimal(list.get(2), integer);
                        if (firstNumber == 0 || secNumber == 0) continue;
                        int opNum = operator.equals("+") ? firstNumber + secNumber : firstNumber - secNumber;
                        if (opNum == convertToDecimal(resultNumber, integer)) {
                            baseOp.add(integer);
                        }
                    }
                }
            }
            ops.add(baseOp);
        }
        List<Integer> mergedList = mergeAndRemoveDuplicates(ops);
        String[] result = new String[listExpressions.size()];
        for (int i = 0; i < listExpressions.size(); i++) {
            HashSet<String> hashSet = new HashSet<>();
            List<String> list = extractNumbersAndOperators(listExpressions.get(i));
            for (int j : mergedList) {
                int firstNumber = convertToDecimal(list.get(0), j);
                String operator = list.get(1);
                int secNumber = convertToDecimal(list.get(2), j);
                if (firstNumber == 0 || secNumber == 0) continue;
                int opNum = operator.equals("+") ? firstNumber + secNumber : firstNumber - secNumber;
                hashSet.add(convertToBase(opNum, j));
            }
            if (hashSet.size() > 1) {
                result[i] = list.get(0) + " " + list.get(1) + " " + list.get(2) + " = " + "?";
            }
            if (hashSet.size() == 1) {
                result[i] = list.get(0) + " " + list.get(1) + " " + list.get(2) + " = " + hashSet.iterator().next();
            }
        }

        return result;
    }

    public static int convertToDecimal(String number, int base) {
        try {
            return Integer.parseInt(number, base);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static List<String> extractNumbersAndOperators(String equation) {
        List<String> resultList = new ArrayList<>();

        equation = equation.replace("=", "").trim();

        String[] parts = equation.split(" ");

        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                resultList.add(part.trim());
            }
        }

        return resultList;
    }

    public static List<Integer> mergeAndRemoveDuplicates(List<List<Integer>> ops) {
        if (ops.isEmpty()) {
            return new ArrayList<>();
        }

        Set<Integer> commonSet = new HashSet<>(ops.get(0));

        for (int i = 1; i < ops.size(); i++) {
            commonSet.retainAll(ops.get(i));
        }

        return new ArrayList<>(commonSet);
    }

    public static String convertToBase(int decimalNumber, int base) {
        if (decimalNumber == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            result.insert(0, remainder);
            decimalNumber /= base;
        }

        return result.toString();
    }
}
