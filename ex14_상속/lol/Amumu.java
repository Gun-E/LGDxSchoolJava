package ex14_상속.lol;

public class Amumu extends LolCharacter{
    public Amumu(String name, String position) {
        super(name, position);
    }

    @Override
    public void q() {
        System.out.println("붕대 던지기(Bandage Toss) !!!");
    }

    @Override
    public void e() {
        System.out.println("짜증내기(Tantrum) !!!");
    }

    @Override
    public void r() {
        System.out.println("슬픈 미라의 저주(Curse of the Sad Mummy) !!!");
    }

    @Override
    public void flash(){
        super.flash();
    }

}
