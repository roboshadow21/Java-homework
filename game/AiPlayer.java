package game;

import java.util.Random;

public class AiPlayer extends Player {

    public AiPlayer() {
        super();
    }

    @Override
    public int getCandies(int num) {
        Random rand = new Random();
        return rand.nextInt(1, 3);
    }

}




