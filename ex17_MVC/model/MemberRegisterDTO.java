package ex17_MVC.model;

public class MemberRegisterDTO {

    // DTO(Data Transfer Object) : 데이터를 전달 수정하는 객체
    // VO (Value Object) : 불변(immutable) 객체로, 특정 비즈니스 값을 나타내기 위해 사용
    private String id;
    private final String pw;
    private final String name;
    private final int age;

    public MemberRegisterDTO(String id, String password, String name, int age) {
        this.id = id;
        this.pw = password;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
