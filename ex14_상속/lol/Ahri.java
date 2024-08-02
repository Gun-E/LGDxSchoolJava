package ex14_상속.lol;

public class Ahri extends LolCharacter{
    public Ahri(String name, String position) {
        super(name, position);
    }

    @Override
    public void q() {
        System.out.println("현혹의 구슬(Orb of Deception) !!!");
    }

    @Override
    public void e() {
        System.out.println("매혹(Charm) !!!");
    }

    @Override
    public void r() {
        System.out.println("혼령 질주(Spirit Rush) !!!");
    }

    @Override
    public void flash(){
        super.flash();
    }
}
