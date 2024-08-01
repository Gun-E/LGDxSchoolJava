package ex13_class;

public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int attackPower;
    private int defencePower;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Pokemon(String name, String type, int level, int attackPower, int defencePower, int hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.hp = hp;
    }

    public void attack() {
        System.out.println(name+"의 공격~! 공격력 "+attackPower);
    }

    public void defense() {
        System.out.println(defencePower+"만큼 쉴드! "+name+"의 방어성공!");
    }


}
