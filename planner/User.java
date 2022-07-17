package planner;

public class User {
    String name;
    String surname;

    private User(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public User(String name) {
        this(name, "");
    }

    public User() {
        this("", "");
    }

    public void setName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return String.format(this.name, this.surname);
    }

    public String setTask(String description, String deadline, String priority) {
        Task ts =  new Task(description, deadline, priority);
        return String.format(ts.description + " " + ts.deadline + " " + ts.priority);
    }
}
