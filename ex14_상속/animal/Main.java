package ex14_상속.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("식빵이");
        Dog dog = new Dog("뽀삐");

        System.out.println(cat.getName()+"와 "+dog.getName());
    }
}
