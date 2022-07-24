package game;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer() {
        super();
    }

    @Override
    public int getCandies(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take 1 or 2 candies: ");
        return sc.nextInt();
    }


}

