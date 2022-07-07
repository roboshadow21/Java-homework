package animals;

public class Program {
    public static  void main(String[] args) {
        Cat cat = new Cat("russian", "Murka");
        System.out.println(cat.getClass().getSimpleName());
        System.out.println(cat.getInfo());
        cat.move();
        System.out.println();
        System.out.println(cat.sleep());
        cat.play();
        System.out.println();
        System.out.println(cat.eat());
        cat.getVoice();
    }
}
