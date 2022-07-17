package animals;

public class Program {
    public static  void main(String[] args) {
        Cat cat = new Cat();
        cat.setInfo("russian longhair", "Murka");
        Owner host = new Owner();
        host.setFullName("John", "Doe");
        Controller c = new Controller();
        c.Call(host, cat);
        System.out.println();
        c.Feed(host,cat);
        System.out.println();
        c.Play(host, cat);

    }
}
