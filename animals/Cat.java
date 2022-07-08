package animals;

public class Cat extends Animal implements Actions {

    public Cat() {
        super();
    }

    @Override
    public void play() {
        System.out.printf("%s play with knot", nickname);
    }

    @Override
    public void move() {
        System.out.printf("%s jump to the owner", nickname);
    }

    @Override
    public void getVoice() {
        System.out.printf("%s meows", nickname);
    }
}
