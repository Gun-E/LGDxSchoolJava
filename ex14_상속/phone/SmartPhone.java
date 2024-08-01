package ex14_상속.phone;

public class SmartPhone extends FeaturePhone{
    @Override
    public void call() {
        System.out.println("call");
    }
    @Override
    public void text(){
        System.out.println("text");
    }
    @Override
    public void carmera(){
        System.out.println("SmartPhone carmera");
    }
    public void internet(){
        System.out.println("internet");
    }
}
