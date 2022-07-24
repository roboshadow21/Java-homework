package game;

import java.util.ArrayList;

public class Save {
    ArrayList<Game> save = new ArrayList<>();

    public void SaveGame(Game game) {
        save.add(game);
    }
}
