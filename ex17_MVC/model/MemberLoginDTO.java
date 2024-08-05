package ex17_MVC.model;

public class MemberLoginDTO {
    private final String id;
    private final String pw;

    public MemberLoginDTO(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }
}
