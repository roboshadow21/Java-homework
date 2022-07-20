package simple_messenger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Chat extends Path implements Messages {

    ArrayList<User> chat = new ArrayList<>();


    @Override
    public void addUser(User user, int pass) {
        if (user.checkPass(pass)) {chat.add(user);}
        else {
            System.out.printf("Wrong password, %s!\n", user.name);
        }

    }

    @Override
    public void sendTextMsg(User user, String msg) throws IOException {
        if (chat.contains(user)) {
            System.out.printf("%s: %s\n", user.name, msg);
            SaveTextMsg(msg);
        }
    }

    @Override
    public void sendVideoMsg() {

    }

    @Override
    public void sendPhotoMsg() {

    }

    @Override
    public void sendVoiceMsg() {

    }

    @Override
    public void SaveTextMsg(String msg) throws IOException {
        FileWriter f = new FileWriter(path, true);
        f.write(msg + "\n");
        f.close();

    }
}
