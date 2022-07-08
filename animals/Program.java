package animals;

public class Program {
    public static  void main(String[] args) {
        Cat cat = new Cat();
        cat.setInfo("russian longhair", "Murka");
        Owner host = new Owner();
        host.setFullName("John", "Doe");
        System.out.println(host.getFullName());
        System.out.println(cat.getNick());
        System.out.println(cat.getInfo());
//        cat.move();
//        System.out.println();
//        System.out.println(cat.sleep());
//        cat.play();
//        System.out.println();
//        System.out.println(cat.eat());
//        cat.getVoice();
    }
}
