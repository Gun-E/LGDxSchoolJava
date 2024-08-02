package ex14_상속.lol;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LolCharacter shaco = new Shaco("샤코", "정글");
        LolCharacter ahri = new Ahri("아리", "미드");
        LolCharacter amumu = new Amumu("아무무", "정글");

        List<LolCharacter> list = new ArrayList<>();
        list.add(shaco);
        list.add(ahri);
        list.add(amumu);

        list.forEach(System.out::println);
//        System.out.println("=====샤코=====");
//        System.out.println(shaco);
//        shaco.q();
//        shaco.e();
//        shaco.r();
//        shaco.flash();
//        System.out.println("=====아리=====");
//        System.out.println(ahri);
//        ahri.q();
//        ahri.e();
//        ahri.r();
//        System.out.println("=====아무무=====");
//        System.out.println(amumu);
//        amumu.q();
//        amumu.e();
//        amumu.r();
    }
}
