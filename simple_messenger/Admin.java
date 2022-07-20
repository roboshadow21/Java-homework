package simple_messenger;

import java.util.ArrayList;

public class Admin extends User {

    private Admin(String role) {
        super();
    }
    public Admin() {
        this("");
    }
    public void delUser(ArrayList<User> list, User user) {
        list.remove(user);
    }

}
