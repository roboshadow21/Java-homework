package animals;


public class Controller {

    public void Call(Owner o, Animal a) {
        o.call(a.nickname);
        System.out.println();
        a.getVoice();
        System.out.println();
        a.move();

    }

    public void Feed(Owner o, Animal a) {
        o.call(a.nickname);
        System.out.println();
        a.getVoice();
        System.out.println();
        a.eat();
        System.out.println();
        a.sleep();

    }

    public void Play(Owner o, Animal a) {
        o.call(a.nickname);
        System.out.println();
        a.getVoice();
        System.out.println();
        a.play();

    }
}
