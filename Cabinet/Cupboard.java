package Cabinet;

public class Cupboard implements Interfaces {
    String type;
    int items;

    private Cupboard(String name, int num) {
        this.type = name;
        this.items = num;
    }
    public Cupboard(String name) {
        this(name, 5);
    }
    public Cupboard() {
        this("undefined");
    }


    public String getType() {
        return String.format("the %s ", this.type);
    }
    public String showItemsNumber() {
        return String.format("there are %d items in the %s", this.items, this.type);
    }
    public void getStatus(int st) {
        if (st == 1) {openCupboard();} else {shutCupboard();}
    }

    @Override
    public void openCupboard() {
        System.out.println(String.format("the %s is open", this.type));
    }

    @Override
    public void shutCupboard() {
        System.out.println(String.format("the %s is closed", this.type));
    }
}
