package Cabinet;


public class Person {
    String firstName;
    String lastName;


    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
    public boolean getKey(int key) {
        return key == 1;
    }


}
