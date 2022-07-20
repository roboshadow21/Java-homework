package simple_messenger;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Admin a = new Admin();
        a.setUserName("John");
        a.setUserPassword(111);
        a.setRole("admin");
        ChatUser cu = new ChatUser();
        cu.setUserName("Simon");
        cu.setUserPassword(222);
        cu.setRole("user");
        Chat ch = new Chat();
        ch.addUser(a, 111);
        ch.addUser(cu, 222);
        ch.sendTextMsg(a, "Hello!");
        ch.sendTextMsg(cu, "How are you?");
        a.delUser(ch.chat, cu);
        ch.sendTextMsg(cu, "Whats up??");

    }
}
