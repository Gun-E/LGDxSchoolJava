package ex14_상속.lol;

public class Shaco extends LolCharacter{

    public Shaco(String name, String position) {
        super(name, position);
    }

    @Override
    public void q() {
        System.out.println("속임수(Deceive) !!!");
    }

    @Override
    public void e() {
        System.out.println("양날 독(Two-Shiv Poison) !!!");
    }

    @Override
    public void r() {
        System.out.println("환각(Hallucinate) !!!");
    }

    @Override
    public void flash(){
        super.flash();
    }

}
