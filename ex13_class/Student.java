package ex13_class;


public class Student {
    private String name;
    private String birth;
    private int age;
    private int javaScore;
    private int dbScore;
    private int mlScore;

    public Student(String name, String birth, int age, int javaScore, int dbScore, int mlScore) {
        this.name = name;
        this.birth = birth;
        this.age = age;
        this.javaScore = javaScore;
        this.dbScore = dbScore;
        this.mlScore = mlScore;
    }

    @Override
    public String toString() {
        return "이름 : " + name +
                "\n생일 : " + birth +
                "\n나이 : " + age +
                "\nJava 점수 : " + javaScore +
                "\n데이터베이스 점수 : " + dbScore +
                "\n머신러닝 점수 : " + mlScore +
                '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getDbScore() {
        return dbScore;
    }

    public void setDbScore(int dbScore) {
        this.dbScore = dbScore;
    }

    public int getMlScore() {
        return mlScore;
    }

    public void setMlScore(int mlScore) {
        this.mlScore = mlScore;
    }
}
