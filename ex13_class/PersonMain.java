package ex13_class;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("강건", 26, "남"),
                new Person("권동현", 26, "남"),
                new Person("강윤서", 24, "여"),
                new Person("송효진", 24, "여")
        );
        Person person = new Person("qwe",1,"qwe");

        System.out.println("------사람 정보------");
        people.forEach(System.out::println);
    }
}
