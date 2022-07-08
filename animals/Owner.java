package animals;

public class Owner {
    String firstName;
    String lastName;
    private Owner(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    public Owner(String fname) {
        this(fname, "");
    }
    public Owner() {
        this("", "");
    }
    String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
    protected void setFullName(String name, String surname) {
        this.firstName = name;
        this.lastName = surname;
    }
}
