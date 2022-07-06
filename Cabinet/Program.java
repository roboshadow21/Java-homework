package Cabinet;

public class Program {
    public static void main(String[] args) {
        Cupboard obj = new Cupboard("Bookcase");
        Person human = new Person("John", "Doe");
        openCupboard(1, human, obj);

    }
    static void openCupboard(int key, Person human, Cupboard obj) {
        if (human.getKey(key)) {
            System.out.printf("%s successfully opens %s\n", human.getFullName(), obj.getType());
            obj.getStatus(key);
            System.out.println(obj.showItemsNumber());
            obj.shutCupboard();
        } else {System.out.println("Wrong key!");}


    }
}
