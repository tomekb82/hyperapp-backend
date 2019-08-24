package hyperapp.domain.user;

public class User {

    private final String name;
    private final String passwd;
    private String token;

    public User(String name, String passwd, String token) {
        this.name = name;
        this.passwd = passwd;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
