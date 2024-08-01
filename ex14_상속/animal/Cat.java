package ex14_상속.animal;

public class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println("냥냥");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("고냥이 놀다");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
