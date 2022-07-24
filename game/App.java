package game;

public class App {
    Game game = new Game();
    Save sv = new Save();
    int result;

    public void initGame(int num) {
        while (num > 0) {
            result = game.GameLoop(num);
            num = result;
            sv.SaveGame(game);
        }

    }
}
