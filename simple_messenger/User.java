package simple_messenger;

public abstract class User {
    String name;
    String role;
    int password;

    private User(String name, String role, int pass) {
        this.name = name;
        this.role = role;
        this.password = pass;
    }

    public User(String name, String role) {
        this(name, role, 0);
    }

    public User() {
        this("", "", 0);
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public void setUserPassword(int pass) {
        this.password = pass;
    }

    public String getUserName() {
        return this.name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public boolean checkPass(int password) {
        return this.password == password;
    }
}
