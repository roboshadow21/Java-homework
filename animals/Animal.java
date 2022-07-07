package animals;

public abstract class Animal implements Movements {
    String breed;
    String nickname;
    public Animal(String breed, String nick) {
        this.breed = breed;
        this.nickname = nick;
    }
    public String getInfo() {
        return String.format("breed -  %s, nickname - %s", this.breed, this.nickname);
    }
    public String sleep() {
        return String.format("%s sleeping", this.nickname);
    }

//    @Override
//    public void move() {
//        System.out.printf("%s run to the owner", this.nickname);
//    }
    public String eat() {
        return String.format("%s eats food", nickname);
    }
}
