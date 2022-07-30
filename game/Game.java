package game;

import java.util.Random;

public class Game {
    int res;
    HumanPlayer hp = new HumanPlayer();
    AiPlayer ap = new AiPlayer();

    public int GameLoop(int number) {
        System.out.printf("Total candies left - %d\n", number);
        if (number <= 2) {
            System.out.println("Game over!");
            return 0;
        } else {
            System.out.println("---Human move---");
            res = hp.getCandies(number);
            number -= res;
            System.out.printf("Total candies left - %d\n", number);
            System.out.println("---AI move---");
            res = ap.getCandies(number);
            System.out.printf("AI choice - %d candies\n", res);
            number -= res;
            return number;

        }

    }


}
