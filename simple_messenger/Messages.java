package simple_messenger;

import java.io.IOException;

public interface Messages {

    void addUser(User user, int pass);

    void sendTextMsg(User user, String msg) throws IOException;
    void sendVideoMsg();
    void sendPhotoMsg();
    void sendVoiceMsg();
    void SaveTextMsg(String msg) throws IOException;
}
