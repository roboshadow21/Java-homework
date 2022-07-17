package planner;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        User user = new User();
        ID id = new ID();
        user.setName("John", "Doe");
        Planner.importTask("test.csv", user.setTask("task1", "21.07.22", "low"), user, id);
        Planner.exportTask();
    }
}
