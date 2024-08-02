package ex14_상속.lol;

public abstract class LolCharacter {
    private String name;
    private String position;

    public LolCharacter(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public abstract void q();
    public abstract void e();
    public abstract void r();
    public void flash(){
    System.out.println("점멸! 빠르게 도망가기");
    }
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

}
