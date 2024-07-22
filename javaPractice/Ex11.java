package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            lottoNumbers.add(i);
        }

        Collections.shuffle(lottoNumbers);

        for (int i = 0; i < 6; i++) {
            System.out.println("행운의 숫자 : " + lottoNumbers.get(i));
        }
    }
}
