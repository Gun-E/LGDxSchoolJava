package ex14_상속.animal;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry();
    public abstract void play();

    public String getName() {
        return name;
    }
}
