package animals;

public abstract class Animal implements Actions {
    String breed;
    String nickname;
    public Animal(String breed, String nick) {
        this.breed = breed;
        this.nickname = nick;
    }
//    public Animal(String breed) {
//        this(breed, "");
//    }
    public String getNick() {
        return String.format("%s", this.nickname);
    }

    public String getInfo() {
        return String.format("%s, breed - %s, nickname - %s", this.getClass().getSimpleName(),
                this.breed, this.nickname);
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
