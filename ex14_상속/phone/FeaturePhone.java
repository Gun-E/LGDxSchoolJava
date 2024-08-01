package ex14_상속.phone;

public class FeaturePhone extends Phone{
    @Override
    public void call() {
        System.out.println("call");
    }
    @Override
    public void text(){
        System.out.println("text");
    }
    public void carmera(){
        System.out.println("carmera");
    }
}
