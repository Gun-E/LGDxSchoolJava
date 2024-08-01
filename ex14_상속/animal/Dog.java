package ex14_상속.animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    @Override
    public void play() {
        System.out.println("강아지 놀다");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
